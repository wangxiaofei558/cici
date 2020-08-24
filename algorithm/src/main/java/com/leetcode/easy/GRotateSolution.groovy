package com.leetcode.easy

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 * <p>
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
class GRotateSolution {

    private static int[] rotate(int[] nums, int k) {
        k = k % nums.length
        int[] result = new int[nums.length]
        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i]
        }
        result
    }

    static void main(String[] args) {
        int[] result = rotate([1, 2, 3, 4] as int[], 2)
        for (int i = 0; i < result.length; i++) {
            println result[i]
        }
    }
}

