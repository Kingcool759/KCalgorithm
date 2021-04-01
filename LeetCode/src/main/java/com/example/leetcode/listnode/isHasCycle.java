package com.example.leetcode.listnode;

/**
 * @data on 4/1/21 2:56 PM
 * @auther KC
 * @describe 判断链表是否有环
 */

public class isHasCycle {
    public boolean hasCycle(ListNode head) {
        /**
         * 解决思路：快慢指针
         * 当快指针=慢指针的时候，证明链表有环
         */
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}

//链接牛客：https://www.nowcoder.com/practice/650474f313294468a4ded3ce0f7898b9?tpId=188&tqId=38282&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-week%2Fquestion-ranking&tab=answerKey

/**
 * 已经定义好了
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */