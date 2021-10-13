package com.eagle.algorithm.divide_and_conquer;

/**
 * @author eagle2020
 * @date 2021/10/13
 */

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.Resource;

@SpringBootTest(classes = {CountInverseOrder.class})
public class CountInverseOrderTest {
    @Resource
    private CountInverseOrder countInverseOrder;


    @Test
    public void testCountInverseOrderTest(){
        int[] nums = {13, 8, 10, 6, 15, 18, 12, 20, 9, 14, 17, 19};
        int i = countInverseOrder.countInverse(nums);
//        System.out.println(i);
        Assert.isTrue(i == 20, "error");
    }
}
