package com.example.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @data on 4/6/21 12:03 PM
 * @auther KC
 * @describe 实现LRU算法-最近最少使用算法
 */
public class LRUCacheMain {
    //用于验证测试用例
    public static void main(String[] args) {
        //capacity:int 容量
//        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );//第一种解法
        LRUCache2 cache = new LRUCache2( 2 /* 缓存容量 */ );//第二种解法
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        System.out.println(cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        System.out.println(cache.get(1));       // 返回 -1 (未找到)
        System.out.println(cache.get(3));       // 返回  3
        System.out.println(cache.get(4));       // 返回  4
    }
}

/**
 * 第一种解法：
 * 使用LinkedHashMap实现LRU算法
 *
 * LinkedHashMap是HashMap的子类，所以LinkedHashMap自然会拥有HashMap的所有特性。
 * 比如，LinkedHashMap的元素存取过程基本与HashMap基本类似，只是在细节实现上稍有不同。
 * LinkedHashMap增加了时间和空间上的开销，但是它通过维护一个额外的双向链表保证了迭代顺序。
 * 特别地，该迭代顺序可以是插入顺序，也可以是访问顺序。因此，根据链表中元素的顺序可以将LinkedHashMap分为：
 * 保持插入顺序的LinkedHashMap 和 保持访问顺序的LinkedHashMap，其中LinkedHashMap的默认实现是按插入顺序排序的。
 * ————————————————
 * 版权声明：本文为CSDN博主「书呆子Rico」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/justloveyou_/article/details/71713781
 */
class LRUCache {

    int capacity;
    Map<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity);
    }

    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        //删除旧位置、放入新位置
        Integer value = map.remove(key);
        map.put(key,value);
        return value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){  //已经存在该值
            map.remove(key);
            map.put(key,value);
            return;
        }
        map.put(key,value);
        //超出容量-capacity
        if (map.size() > capacity){
            map.remove(map.entrySet().iterator().next().getKey()); //map.entrySet()对key-value进行遍历
        }
    }
}

/**
 * 第二种解法：
 * 使用双向链表+hashMap实现LRU算法
 */
class LRUCache2 {

    // 定义一个双向链表
    static class Node {
        Integer key;
        Integer value;

        public Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }

        Node pre;
        Node next;
    }

    // 用来快速定位节点和记录节点数量
    private HashMap<Integer, Node> map;
    // 虚拟头节点
    private Node dummyFirst;
    // 虚拟尾节点
    private Node dummyLast;
    // LRU的容量
    private int capacity;

    /**
     * 初始化方法
     * @param capacity 指定缓存的容量
     */
    public LRUCache2(int capacity) {
        map = new HashMap<>(capacity);
        dummyFirst = new Node(-1, -1);
        dummyLast = new Node(-1, -1);
        // 建立虚拟头和虚拟尾节点的关系
        dummyFirst.next = dummyLast;
        dummyLast.pre = dummyFirst;
        this.capacity = capacity;
    }

    /**
     * 从缓存中获取数据
     * @param key 缓存的键
     * @return 缓存的值
     */
    public int get(int key) {
        // 如果map中没有这个key,证明没有命中缓存,直接返回-1即可
        if (!map.containsKey(key)) {
            return -1;
        }
        Node target = map.get(key);
        // 将命中缓存的节点移到链表的最末尾（虚拟尾节点前面）
        moveToTail(target, false);
        return target.value;
    }

    /**
     * 向缓存中写入数据
     * @param key 写入的键
     * @param value 写入的值
     */
    public void put(int key, int value) {
        // 如果这个map存在的话,只需要把这个节点移到链表的最末尾（虚拟尾节点前面）,并修改链表的值即可
        if (map.containsKey(key)) {
            moveToTail(map.get(key), false);
            map.get(key).value = value;
            return;
        }
        // 如果map不存在的话,需要在map和链表的最末尾（虚拟尾节点前面）新增这个节点,并且检查现在缓存超没超容量,如果超了的话需要删除链表的最前面的节点(虚拟头节点的后面)
        Node node = new Node(key, value);
        map.put(key, node);
        moveToTail(node, true);
        while (map.size() > capacity) {
            map.remove(dummyFirst.next.key);
            dummyFirst.next = dummyFirst.next.next;
            dummyFirst.next.pre = dummyFirst;
        }
    }

    /**
     * 将节点移动至链表的末尾，假末尾节点前面
     */
    private void moveToTail(Node node, boolean insert) {
        // 如果不是新增,而是修改,我们要维护原节点的pre和next节点的next和pre引用
        if (!insert) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        // 将节点移动到链表的最末尾（虚拟尾节点前面）
        node.next = dummyLast;
        node.pre = dummyLast.pre;
        dummyLast.pre = node;
        node.pre.next = node;
    }
}

