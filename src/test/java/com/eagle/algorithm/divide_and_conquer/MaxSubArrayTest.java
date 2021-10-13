package com.eagle.algorithm.divide_and_conquer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * @author eagle2020
 * @date 2021/10/13
 */
@SpringBootTest(classes = {MaxSubArray.class})
public class MaxSubArrayTest {
    @Resource
    private MaxSubArray maxSubArray;

    /**
     * 测试算法计算结果是否符合预期
     */
    @Test
    public void testMaxSunArray() {
        int ans = maxSubArray.maxSubArray(new int[]{1, -2, 4, 5, -2, 8, 3, -2, 6, 3, 7, -1});
        Assert.isTrue(ans == 32, "error测试算法计算结果不符合预期");
    }
}
