package com.eagle.algorithm.sort;

/**
 * @author eagle2020
 * @date 2021/10/15
 */
public class QuickSort {
    public void quick(int[] nums){
        quick(nums, 0, nums.length - 1);
    }
    public void quick(int[] nums, int left, int right){
        if(left < right){
            int p = divide(nums, left, right);
            quick(nums, left, p - 1);
            quick(nums, p + 1, right);
        }
    }
    public int divide(int[] nums, int left, int right){
        int x = nums[right];
        int i = left - 1;
        for(int j = left; j < right; j++){
            if(nums[j] <= x){
                exchange(nums, i + 1, j);
                i++;
            }
        }
        exchange(nums, i + 1, right);
        return i + 1;
    }
    static private void exchange(int[] nums, int left, int right){
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }
}
