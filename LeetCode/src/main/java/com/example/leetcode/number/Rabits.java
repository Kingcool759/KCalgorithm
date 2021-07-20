package com.example.leetcode.number;

/**
 * @data on 2021/7/20 3:06 下午
 * @auther
 * @describe
 */
public class Rabits {
    int findRabitsNums(int n) {
        int n1 = 0, n2 = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (n1 + n2) % 1000000007;
            n1 = n2;
            n2 = sum;
        }
        return n1;
    }
}
