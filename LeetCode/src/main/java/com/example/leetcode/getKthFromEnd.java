package com.example.leetcode;

/**
 * @data on 3/28/21 9:52 PM
 * @auther KC
 * @describe 找到链表倒数第K个节点
 */

public class getKthFromEnd {
    public ListNode getKthFromEndInListNode(ListNode head, int k) {
        /*
         *快慢指针（经典场景）
         *先让快指针走到第k个节点位置，然后让快慢指针一起走，当快指针走到链表的最后一个节点时，慢指针正好指向倒数第k个节点
         *输出慢指针节点：正好为倒数第K个
         */
        // 链接：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
        ListNode frontNode = head, behindNode = head;
        while (frontNode != null && k > 0) {
            frontNode = frontNode.next;
            k--;
        }
        while (frontNode != null) {
            frontNode = frontNode.next;
            behindNode = behindNode.next;
        }
        return behindNode;
    }
}

/**
 * 链表节点结构(已知)
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}