package com.example.leetcode.array;

/**
 * @data on 2021/7/20 10:52 上午
 * @auther
 * @describe 买卖股票算法
 */
public class Shares {
    //【题目一：】121. 买卖股票的最佳时机
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
