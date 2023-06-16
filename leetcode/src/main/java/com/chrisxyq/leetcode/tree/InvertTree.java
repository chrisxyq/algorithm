package com.chrisxyq.leetcode.tree;


import com.chrisxyq.leetcode.common.TreeNode;

/**
 * leetcode 226
 * 反转二叉树
 */
public class InvertTree {
    /**
     * 分解问题的思路
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        //先保存变量
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        //然后统一赋值
        root.left = left;
        root.right = right;
        return root;
    }

    /**
     * 使用遍历问题的思路
     * 前序遍历，对每个节点执行交换左右节点的操作
     *
     * @param root
     * @return
     */
    public TreeNode invertTree1(TreeNode root) {
        traverse(root);
        return root;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        traverse(root.left);
        traverse(root.right);
    }
}
