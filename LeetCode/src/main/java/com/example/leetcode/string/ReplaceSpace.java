package com.example.leetcode.string;

/**
 * @data on 2021/7/23 10:59 上午
 * @auther
 * @describe 用'%20'替换空格
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        int length = s.length();
        char[] array = new char[length * 3]; //最坏情况都是空格，则需要三倍String长度的数组。
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        return new String(array, 0, size);
    }
}
