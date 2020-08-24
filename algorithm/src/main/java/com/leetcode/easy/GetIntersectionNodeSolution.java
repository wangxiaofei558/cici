package com.leetcode.easy;

import com.leetcode.common.ListNode;
import org.springframework.stereotype.Component;



/**
 * 相交链表
 */
@Component
public
class GetIntersectionNodeSolution {

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lenA = getLength(headA), lenB = getLength(headB);
        // 两个链表截取相同长度的链表，再逐一遍历比较大小
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; ++i) headA = headA.next;
        } else {
            for (int i = 0; i < lenB - lenA; ++i) headB = headB.next;
        }
        while (headA != null && headB != null && !headA.equals(headB)) {
            headA = headA.next;
            headB = headB.next;
        }
        // 如果跳出while循环， 说明headA == headB, 如果没有相交，最终相交于null
        return (headA != null && headB != null) ? headA : null;
    }

    private static int getLength(ListNode head) {
        int cnt = 0;
        while (head != null) {
            ++cnt;
            head = head.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        ListNode headB = new ListNode(2, new ListNode(3, new ListNode(4)));

        System.out.println(getIntersectionNode(headA, headB));
    }

}
