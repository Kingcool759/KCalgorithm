package com.example.leetcode.listnode;

/**
 * @data on 2021/7/7 11:06 上午
 * @auther
 * @describe 合并两个有序链表
 */
public class MergeSorted {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){  //链表有一个为空，返回另一个
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode root = new ListNode(0); //创建一个临时节点，用于添加节点
        ListNode behind = root;             //创建一个新链表的尾节点
        while(l1 != null && l2 != null){    //两个链表都不为空，进行合并操作，循环
            if(l1.val < l2.val){
                behind.next = l1;
                l1 = l1.next;
            }else{
                behind.next = l2;
                l2 = l2.next;
            }
            behind = behind.next; //移动新链的尾指针
        }
        //此时已经对比添加完成，其中一个链表必然为空。
        behind.next = (l1 != null) ? l1:l2;
        return root.next;
    }
}
