package com.eagle.algorithm.divide_and_conquer;

import java.util.stream.IntStream;

/**
 * @author eagle2020
 * @date 2021/10/13
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        // https://www.bilibili.com/video/BV1aN411d7Yi?p=12&spm_id_from=pageDriver
        return maxSubArray(nums, 0, nums.length - 1);
    }

    /**
     * 当前数组最大的连续元素之和
     * @param nums 数组
     * @param left 左边界
     * @param right 右边界 inclusive
     * @return 当前数组最大的连续元素之和
     */
    public int maxSubArray(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = ((right - left) >> 1) + left;
        int s1 = maxSubArray(nums, left, mid);
        int s2 = maxSubArray(nums, mid + 1, right);
        int s3 = crossingSubArray(nums, left, mid, right);
        return IntStream.of(s1, s2, s3).max().getAsInt();
    }
    public int crossingSubArray(int[] nums, int left, int mid, int right){
        int leftSum = 0;
        int leftMax = Integer.MIN_VALUE;
        for(int i = mid; i >= left; i--){
            leftSum += nums[i];
            leftMax = Math.max(leftMax, leftSum);
        }
        int rightSum = 0;
        int rightMax = Integer.MIN_VALUE;
        for(int j = mid + 1; j <= right; j++){
            rightSum += nums[j];
            rightMax = Math.max(rightMax, rightSum);
        }
        return leftMax + rightMax;
    }
}
