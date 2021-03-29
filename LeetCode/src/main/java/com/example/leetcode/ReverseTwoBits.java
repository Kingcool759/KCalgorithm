package com.example.leetcode;

/**
 * @data on 3/29/21 11:08 PM
 * @auther KC
 * @describe
 */
public class ReverseTwoBits {

    /**
     * 颠倒给定的 32 位无符号整数的二进制位。
     *
     * 提示：
     *
     * 输入：00000010100101000001111010011100
     * 输出：00111001011110000010100101000000
     * 解释: 输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
     *      因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reverse-bits
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * @param n
     * @return
     */

    public int reverseBits(int n) {
        int a = 0;
        for(int i=0;i<=31;i++){
            a = a+((1&(n>>i))<<(31-i));
        }
        return a ;
    }
}

