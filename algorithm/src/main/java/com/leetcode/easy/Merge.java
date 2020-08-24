package com.leetcode.easy;


/**
 * 合并两个有序数组
 */
public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m );

        int p1 = 0;  // nums1_copy
        int p2 = 0;  // nums2

        int p = 0;   // nums1

        while((p1< m) &&(p2 < n)){
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];  // 取小值
        }

        // if there are still elements to add
        if (p1 < m)
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
    }

    public static void main(String[] args) {
        merge(new int[] {1,2,3}, 3, new int[]{2,3,4,6}, 4);
    }
}
