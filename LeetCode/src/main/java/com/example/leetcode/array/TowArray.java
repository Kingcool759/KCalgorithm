package com.example.leetcode.array;

/**
 * @data on 2021/7/19 6:35 下午
 * @auther
 * @describe 二维数组
 */
public class TowArray {

    //【题目一：】二维数组中的查找 -- 对应剑指offer04
    // 默认条件：二维数组从左到右从上到下元素值递增。
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;  //行数
        int column = matrix[0].length - 1;  //列数
        while (row < matrix.length && column >= 0) {
            if (target == matrix[row][column]) {
                return true;
            } else if (target < matrix[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
