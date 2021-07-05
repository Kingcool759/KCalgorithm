package com.example.leetcode.number;

/**
 * @data on 2021/7/5 10:29 上午
 * @auther
 * @describe 丑数
 */
public class UglyNumber {
    //* 定义：把只包含质因子为2、3和5的数称为丑数。例如，前十个丑数为：1，2，3，4，5，6，8，9，10，12。
    /**
     * 【题目一：】
     * 求第n个丑数
     * @param n
     * @return int
     */
    public int nthUglyNumber(int n) {
        int indexA = 0, indexB = 0, indexC = 0;
        int[] dp = new int[n];
        // 初始化第一个丑数为1
        dp[0] = 1;
        // 从dp[1]开始选
        for (int i = 1; i < n; i++) {
            // dp[i]=min{dp[indexA],dp[indexB],dp[indexC]}
            int n1 = dp[indexA] * 2;
            int n2 = dp[indexB] * 3;
            int n3 = dp[indexC] * 5;
            dp[i] = Math.min(Math.min(n1, n2), n3);
            // 谁被选中作为最小值的index,谁就后移一位
            if (dp[i] == n1) {
                indexA++;
            }
            if (dp[i] == n2) {
                indexB++;
            }
            if (dp[i] == n3) {
                indexC++;
            }
        }
        return dp[n - 1];
    }


    /**
     * 【题目二：】
     * 判断一个数是否为丑数
     */
    public boolean isUgly(int n){
        if (n <= 0) {
            return false;
        }
        int[] factors = {2, 3, 5}; // 丑数定义中的质因子
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
