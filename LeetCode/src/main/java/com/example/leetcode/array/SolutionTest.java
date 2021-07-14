package com.example.leetcode.array;

/**
 * @data on 2021/7/14 10:02 上午
 * @auther
 * @describe
 */
public class SolutionTest {
    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        int[] nums = new int[]{1,2,3,4,3};
        int[] res = ts.twoSum(nums,7);
        for (int re : res) {
            System.out.println(re);  //输出2、3
        }
    }
}
