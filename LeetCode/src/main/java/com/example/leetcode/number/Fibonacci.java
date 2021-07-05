package com.example.leetcode.number;

/**
 * @data on 2021/7/5 10:19 上午
 * @auther
 * @describe 斐波那契数列求解-【动态规划】类型
 */
public class Fibonacci {
    public int fib(int n) {
        int n1 = 0, n2 = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (n1 + n2) % 1000000007;
            n1 = n2;
            n2 = sum;
        }
        return n1;
    }
}
