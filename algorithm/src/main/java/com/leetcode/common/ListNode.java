package com.leetcode.common;


/**
 * 链表
 */
public class ListNode {

    private int val;
    public ListNode next;

    public ListNode(int x) {
        this.val = x;
        this.next = null;
    }

    public ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ListNode) {
            return this.val == ((ListNode) obj).val;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return val;
    }
}
