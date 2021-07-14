package com.example.leetcode.tree;

/**
 * @data on 2021/7/14 10:54 上午
 * @auther
 * @describe
 */
public class LastCommonAncestor {
    //【题目一：求二叉搜索树的最近公共祖先】
    // 参数与返回值：【参数：】根结点、p、q结点；【返回值：】pq最近公共祖先结点。
    // 二叉搜索树特点：左<根<右
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        while(true){
            if(ancestor.val < p.val && ancestor.val < q.val){
                ancestor = ancestor.right;//如果此结点小于pq结点值，则说明pq位于该结点的右子树，转到右边比较
            }else if(ancestor.val > p.val && ancestor.val >q.val){
                ancestor = ancestor.left; //如果此结点大于pq结点值，则说明pq位于该结点的左子树，转到左边比较
            }else{
                break;
            }
        }
        return ancestor;
    }
    //【题目二：求二叉树的最近公共祖先】
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) {
            return root;
        }
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        return l == null ? r : (r == null ? l : root);
        //最后一句等价于：
        // if(l == null){
        //     return r;
        // }else{
        //     if(r == null){
        //         return l;
        //     }else{
        //         return root;
        //     }
        // }
    }
}
