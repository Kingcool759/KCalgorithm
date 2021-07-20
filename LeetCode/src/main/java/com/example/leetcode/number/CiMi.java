package com.example.leetcode.number;

/**
 * @data on 2021/7/20 5:59 下午
 * @auther
 * @describe 次幂运算
 */
public class CiMi {
    public int ciMi(int m, int n) {
        int sum = m;
        for (int i = 1; i < n; i++) {
            sum *= m;
        }
        return sum;
    }
}
