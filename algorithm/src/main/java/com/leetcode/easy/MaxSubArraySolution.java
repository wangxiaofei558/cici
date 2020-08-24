package com.leetcode.easy;


/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxSubArraySolution {

    // 应该是用动态规划思想。定义一个概念，f(k)表示以当前元素结尾的子数组的最大值，则f(k)应该等于max(num[k],f(k-1)+num[k])
    public int maxSubArray(int[] nums) {
        // sum最大值初始为数组第一个元素
        int n = nums.length, maxSum = nums[0];
        // 这里用++i i++ 都一样  i++先赋值后自增,++i是先自增后赋值
        for (int i = 1; i < n; ++i) {
            if (nums[i - 1] > 0) nums[i] += nums[i - 1];
            maxSum = Math.max(nums[i], maxSum);
        }
        return maxSum;
    }
}
