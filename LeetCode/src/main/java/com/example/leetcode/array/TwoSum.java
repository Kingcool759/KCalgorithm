package com.example.leetcode.array;


import java.util.HashMap;
import java.util.Map;

/**
 * @data on 3/29/21 11:20 PM
 * @auther KC
 * @describe 两数之和
 */
public class TwoSum {
    //题目描述： 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
    public int[] twoSum(int[] nums, int target) {
        //第一种解法：双循环-暴力解-时间复杂度O(n*2)
//        for (int i = 0; i < nums.length; ++i) {
//            for (int j = i + 1; j < nums.length; ++j) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[0];

//        //第二种解法：哈希表-优美解-时间复杂度O(n)
        //<key,value>分别存放<数组值，数组下标>
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hash.containsKey(target - nums[i])) {
                return new int[]{hash.get(target - nums[i]), i};
            }
            hash.put(nums[i], i);
        }
        return new int[0];
    }
}
