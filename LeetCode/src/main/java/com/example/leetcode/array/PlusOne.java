package com.example.leetcode.array;

/**
 * @data on 2021/6/29 11:35 上午
 * @auther
 * @describe
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            int value = digits[i] + carry;
            digits[i] = value % 10;
            carry = value / 10;
        }
        if(carry == 1){ //此时每位均为9，需要开辟多一个空间，首位存1，其他位为0
            int[] result = new int[n+1];
            result[0] = 1;
            for(int i = 1; i<result.length; i++){
                result[i] = 0;  //等价于result[i] = digits[i-1];
            }
            return result;
        }
        return digits;
    }
}
