package com.eagle.algorithm.sort;

import com.eagle.algorithm.util.Print;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author eagle2020
 * @date 2021/10/13
 * java.lang.IllegalStateException: Unable to find a @SpringBootConfiguration, you need to use @ContextConfiguration or @SpringBootTest(classes=...) with your test
 */
@SpringBootTest(classes = {MergeSort.class, Print.class})
public class MergeSortTest {

    @Resource
    private MergeSort mergeSort;
    @Resource
    private Print print;

    @Test
    public void mergeSort(){
        int[] arr = {8, 3, 6, 8, 2, 4, 0, 1, 5,11,2,3,4,5,7,1,77,2,5,8,3};
        print.printArr(arr, "归并排序前");
        mergeSort.mergeSort(arr);
        print.printArr(arr, "归并排序后");
//        mergeSort.aa();
    }


}
