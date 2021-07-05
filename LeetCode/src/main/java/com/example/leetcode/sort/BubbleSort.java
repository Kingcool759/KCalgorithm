package com.example.leetcode.sort;

/**
 * @data on 2021/6/30 5:02 下午
 * @auther
 * @describe 手写冒泡排序
 */
public class BubbleSort {
    //冒泡排序
    //思路：重复走访待排序序列，挨个比较相邻两个元素，如果顺序有错(A>B)就交换两者的顺序(A<B)。
    public int[] bubbleSort(int[] arr) {
        int temp = 0;
        boolean swap;
        for (int i = arr.length - 1; i > 0; i--) {
            swap = false;
            for (int j = 0; j < i; j++) {  //从第1个元素到第i个元素
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        return arr;
    }
}
