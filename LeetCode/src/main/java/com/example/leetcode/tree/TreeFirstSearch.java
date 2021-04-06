package com.example.leetcode.tree;

import java.util.Stack;

/**
 * @data on 4/6/21 2:43 PM
 * @auther KC
 * @describe 树的DFS（深度优先遍历算法）和 BFS（广度优先遍历算法）
 */
public class TreeFirstSearch {

}
/**
 * 深度优先搜索
 * 实现思路：利用栈，先将右子树压栈再将左子树压栈
 * 只有伪代码:C++
 * 链接：https://www.cnblogs.com/zhangbaochong/p/5492877.html
 */
//class DFSFirstSearch(TreeNode root){
//    Stack<TreeNode> nodestack;
//    nodestack.push(root);
//    while (!nodeStack.empty())
//    {
//       BitNode *node = nodeStack.top();
//       nodeStack.pop();
//       if (node->right)
//       {
//            nodeStack.push(node->right);
//            }
//       if (node->left)
//            {
//            nodeStack.push(node->left);
//            }
//    }
//}
/**
 * 广度优先搜索
 * 实现思路：利用队列
 */
//class BFSFirstSearch(TreeNode root){
//    queue<TreeNode*> nodeQueue;
//    nodeQueue.push(root);
//    while (!nodeQueue.empty())
//    {
//        TreeNode *node = nodeQueue.front();
//        nodeQueue.pop();
//        if (node->left)
//            {
//            nodeQueue.push(node->left);
//            }
//        if (node->right)
//            {
//            nodeQueue.push(node->right);
//            }
//    }
//}
