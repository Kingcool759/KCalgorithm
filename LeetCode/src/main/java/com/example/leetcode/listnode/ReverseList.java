package com.example.leetcode.listnode;

/**
 * @data on 4/1/21 3:09 PM
 * @auther KC
 * @describe 反转链表
 */

public class ReverseList {

    /**
     * 题目：反转链表
     * 问题描述：输入一个链表，反转链表后，输出新链表的表头。
     * @param head
     * @return
     */

    public ListNode ReverseList(ListNode head) {

        //思路核心：反转链表的核心在于反转，我们反转的并不是数字，而是指向数字的箭头。
        //原本的链表：node1.next = node2，那么反转之后就是node2.next = node1
        //总结一下就是：node1.next.next = node1

        /**
         * 第一种解决方法：递归
         */
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode newHead = ReverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;

        /**
         * 第二种解决方法：迭代
         */
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode nxt =  curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
