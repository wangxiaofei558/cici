package com.leetcode.easy


/**
 * 二分查找
 */
class GSearchInsertSolution {

    private static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0
        }
        int l = 0
        int r = nums.length - 1
        while (l <= r) {
            int mid = (l + r) / 2
            if (nums[mid] == target)
                return mid
            if (nums[mid] < target)
                l = mid + 1
            else
                r = mid - 1
        }
        l
    }

    static void main(String[] args) {
        def a = [1, 2, 4, 7, 8] as int[]
        def b = 6
        def x = searchInsert(a, b)
        println x
    }
}
