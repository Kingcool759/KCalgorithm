package com.example.leetcode.sort;

/**
 * @data on 2021/7/8 10:32 上午
 * @auther
 * @describe 快排
 */
public class QuickSort {

    /**
     * 快速排序调用方法
     *
     * @param ary   待排序数组
     * @param left  左值
     * @param right 右值
     * @return int值
     * @author Cansluck
     */
    public static int getSortNum(int[] ary, int left, int right) {
        int pivot = ary[left];  // 定义一个中枢值pivot，让其等于数组的左值，枢轴选定后永远不变，最终在中间，前小后大
        while (left < right) {
            while (left < right && ary[right] >= pivot) {   // 看后面ary[right] > pivot比较，如果右边数组值大于中枢值，说明不需要调整位置，则让右值（right）自减1
                right--;  // 执行自减操作
            }
            ary[left] = ary[right];   // 如果上面循环不符合条件的，则说明右边数组的一个值，小于中枢值（pivot），则将其替换到左边数组中
            while (left < right && ary[left] <= pivot) {  // 看后面ary[left] < pivot比较，如果左边数组值小于中枢值，说明不需要调整位置，则让左值（left）自增1
                left++;  // 执行自增操作
            }
            ary[right] = ary[left];   // 如果上面循环不符合条件，则说明左边数组的一个值，大于中枢值（pivot），则将其替换到右边数组中
        }
        ary[left] = pivot;  // 最后将中枢值给自增后的左边数组的一个值中
        return left;     // 返回左边数组下标
    }

    /**
     * 快速排序递归方法
     *
     * @param ary   待排序数组
     * @param left  左值
     * @param right 右值
     * @author Cansluck
     */
    public static void quickSort(int[] ary, int left, int right) {
        int pivot; // 定义中枢值
        if (left < right) {         // 判断
            pivot = getSortNum(ary, left, right);  // 根据方法得到了每次中枢值的位置
            quickSort(ary, left, pivot - 1);  // 根据中枢值（pivot），来对左边数组进行递归调用快速排序
            quickSort(ary, pivot + 1, right);   // 根据中枢值（pivot），来对右边数组进行递归调用快速排序
        }
    }

    //验证一下
    public static void main(String[] args) {
        int[] ary = {97, 58, 12, 88, 77, 22, 33, 44, 66, 22};
        quickSort(ary, 0, ary.length - 1);
        for (int i = 0; i < ary.length; i++) {
            if (i != ary.length - 1)
                System.out.print(ary[i] + ", ");
            else
                System.out.println(ary[i]);
        }
    }
}
