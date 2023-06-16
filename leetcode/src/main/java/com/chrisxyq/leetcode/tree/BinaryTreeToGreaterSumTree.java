package com.chrisxyq.leetcode.tree;
import com.chrisxyq.leetcode.common.TreeNode;

/**
 * 1038. 把⼆叉搜索树转换为累加树
 */
public class BinaryTreeToGreaterSumTree {
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }

    int sum = 0;

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        //先右边
        traverse(root.right);
        //维护累加和
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }

}
