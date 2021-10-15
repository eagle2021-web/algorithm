package com.eagle.algorithm.sort;

import javax.annotation.Resource;

import com.eagle.algorithm.util.Print;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



/**
 * @author eagle2020
 * @date 2021/10/15
 */
@SpringBootTest(classes = {QuickSort.class, Print.class})
public class QuickSortTest {
    @Resource
    private QuickSort quickSort;

    @Resource
    private Print print;

    @Test
    public void testQuickSort() {
        testQuickSort(new int[]{2, 6, 7, 1, 3, 5, 6, 4});
    }

    private void testQuickSort(int[] nums) {
        print.printArr(nums, "排序前");
        quickSort.quick(nums);
        print.printArr(nums, "排序后");
    }

    @Test
    public void test(){
        int a = 1;
        int b = 3;
        while(a != 0){
            int temp = a ^ b;
            a = (a & b) << 1;
            b = temp;
        }
        System.out.println(b);
    }
}
