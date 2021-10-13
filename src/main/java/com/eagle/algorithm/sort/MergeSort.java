package com.eagle.algorithm.sort;

import com.eagle.algorithm.util.Print;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @author eagle2020
 * @date 2021/10/13
 */
@SuppressWarnings("unused")
@Component
public class MergeSort {
    @Resource
    private Print print;
//    https://www.bilibili.com/video/BV1aN411d7Yi?p=8&spm_id_from=pageDriver%2F10%3A30
    private int[] copy = null;


    public void aa(){
        System.out.println(1);
    }
    public void mergeSort(int[] nums){
        copy = Arrays.copyOf(nums, nums.length);
        mergeSort(nums, 0, nums.length - 1);
        print.printArr(nums);
    }
    public void mergeSort(int[] nums, int left, int right){
        if(left >= right){
            return;
        }
        int mid = ((right - left) >> 1) + left;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
    public void merge(int[] nums, int left, int mid, int right){
        int i = left, j = mid + 1;
        int offset = 0;
        while (i <= mid && j <= right){
            if(copy[i] <= copy[j]){
                nums[left + offset] = copy[i];
                i++;
            }else {
                nums[left + offset] = copy[j];
                j++;
            }
            offset++;
        }
        while (i<= mid){
            nums[left + offset] = copy[i];
            i++;
            offset++;
        }
        while (j <= right){
            nums[left + offset] = copy[j];
            j++;
            offset++;
        }
        for(int k = left; k <= right; k++){
            copy[k] = nums[k];
        }
        for(int k = left; k <= right; k++){
            System.out.print(nums[k] + "\t");
        }
        System.out.println();
    }
}
