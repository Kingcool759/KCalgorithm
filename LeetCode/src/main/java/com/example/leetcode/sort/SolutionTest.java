package com.example.leetcode.sort;

import java.util.Arrays;

/**
 * @data on 2021/7/5 10:47 上午
 * @auther
 * @describe
 */
public class SolutionTest {
    public static void main(String[] args){
        BubbleSort bs = new BubbleSort();
        System.out.println(Arrays.toString(bs.bubbleSort(new int[]{4, 3, 2, 1})));
    }
}
