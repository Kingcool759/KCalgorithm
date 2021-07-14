package com.example.leetcode.number;

import java.util.Arrays;

/**
 * @data on 2021/7/14 11:22 上午
 * @auther
 * @describe  h指数：研究者h篇论文分别被引用h次。
 */
public class HIndex {
    //【题目一：h指数】
    public int hIndex1(int[] citations) {
        Arrays.sort(citations); // 先进行排序
        int h = 0,i = citations.length-1;
        while(i>=0 && citations[i] > h){
            h++;
            i--;
        }
        return h;
    }
    //【题目二：升序h指数】
    //是题目一的变化问题，不再进行排序，直接进行h指数运算
    public int hIndex(int[] citations) {
        int h = 0,i = citations.length - 1 ;
        while(i >= 0 && citations[i] > h){
            h++;
            i--;
        }
        return h;
    }
}
