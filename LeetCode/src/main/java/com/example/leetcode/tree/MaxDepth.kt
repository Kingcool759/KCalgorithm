package com.example.leetcode.tree

/**
 * @data on 3/30/21 9:47 AM
 * @auther KC
 * @describe 求二叉树的深度
 */

/**
 *
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 *
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 */


class MaxDepth {

    //求二叉树的深度
    fun maxDepth(root: TreeNode?): Int {
        return traverse(0, root)
    }

    //traverse-贯穿
    private fun traverse(depth: Int, root: TreeNode?): Int {
        if (root == null) {
            return depth
        }
        val newDepth = depth + 1
        val left = traverse(newDepth, root.left)
        val right = traverse(newDepth, root.right)
        return if (left > right) {
            left
        } else {
            right
        }
    }
}