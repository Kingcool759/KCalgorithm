package com.example.leetcode;

/**
 * @data on 3/29/21 11:24 PM
 * @auther KC
 * @describe 删除链表节点
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteListNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

// 链接：https://leetcode-cn.com/problems/delete-node-in-a-linked-list/