package com.example.leetcode.array;

/**
 * @data on 3/29/21 11:20 PM
 * @auther KC
 * @describe 两数之和
 */
public class TwoSum {
    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     * @param nums
     * @param target
     * @return
     * 链接：https://leetcode-cn.com/problems/two-sum/
     */
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for(int i = 0;i<len;++i){
            for(int j = i+1;j<len;++j){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
