package com.eagle.algorithm.util;

/**
 * @author eagle2020
 * @date 2021/10/13
 */
public class Print {
    private final String TITLE = "默认分隔标题";

    public void printArr(int[][] arr) {
        printArr(arr, TITLE);
    }

    public static void printArr(int[][] arr, String title) {
        System.out.println("==" + title + "==");
        for (int[] ints : arr) {
            for (int i : ints) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    public void printArr(int[] arr) {
        printArr(arr, TITLE);
    }

    public void printArr(int[] arr, String title) {
        System.out.println("===" + title + "==");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
