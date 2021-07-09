package com.example.leetcode.listnode;

/**
 * @data on 2021/7/9 9:43 下午
 * @auther
 * @describe
 */
public class SolutionTest {
    public static void main(String[] args){
        Cycle c = new Cycle();
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        head.next = a;
        a.next = b;
        b.next = d;
        d.next = e;
        e.next = b;
        System.out.println(c.detectCycle(head).val);
    }
}
