package com.eagle.algorithm.divide_and_conquer;

/**
 * @author eagle2020
 * @date 2021/10/13
 */
public class CountInverseOrder {
    public int countInverse(int[] nums){
        int len = nums.length;
        int[] copy = new int[len + 1];
        System.arraycopy(nums,0, copy, 0, len);
        divide(nums, 0, len - 1, copy);
//        for (int num : nums) {
//            System.out.print(num + "\t");
//        }
//        System.out.println();
        return copy[len];
    }
    public void divide(int[] nums, int left, int right, int[] copy){
        if(left >= right){
            return;
        }
        int mid = ((right - left) >> 1) + left;
        divide(nums, left, mid, copy);
        divide(nums, mid + 1, right, copy);
        mergeCount(nums, left, mid, right, copy);
    }
    public void mergeCount(int[] nums, int left, int mid, int right, int[] copy){
        int i = left, j = mid + 1;
        int offset = 0;
        int len = copy.length;
        while (i <= mid && j <= right){
            if(copy[i] <= copy[j]){
                nums[left + offset] = copy[i];
                i++;
            }else {
                nums[left + offset] = copy[j];
                j++;
                copy[len - 1] += mid + 1 - i;
            }
            offset++;
        }
        while (i <= mid){
            nums[left + offset++] = copy[i++];
        }
        while (j <= right){
            nums[left + offset++] = copy[j++];
        }
        if (right + 1 - left >= 0) System.arraycopy(nums, left, copy, left, right + 1 - left);
    }
}
