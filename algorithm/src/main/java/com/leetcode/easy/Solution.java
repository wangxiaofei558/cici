package com.leetcode.easy;

import java.util.Arrays;

class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3}, 3, new int[]{2, 3, 4}, 3);
    }
}
