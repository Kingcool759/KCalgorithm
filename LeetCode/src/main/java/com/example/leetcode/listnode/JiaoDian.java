package com.example.leetcode.listnode;

/**
 * @data on 2021/7/6 7:13 下午
 * @auther
 * @describe 求两个链表交点
 */
public class JiaoDian {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> visited = new HashSet<ListNode>();
//        ListNode temp = headA
//        while (temp != null){
//            visited.add(temp);
//            temp = temp.next;
//        }
//        temp = headB;
//        while (visited.contains(temp)){
//            return temp;
//        }
//        return null;
        //另一种解法：双指针法：a+b = b+a
        ListNode front = headA;
        ListNode behind = headB;
        while (front != behind){
            front = front == null ? headB: front.next;
            behind = behind == null ? headA: behind.next;
        }
        return front;
    }
}
