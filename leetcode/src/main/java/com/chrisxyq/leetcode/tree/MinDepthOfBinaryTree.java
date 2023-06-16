package com.chrisxyq.leetcode.tree;

import com.chrisxyq.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * leetcode 111
 * 二叉树最小深度
 */
public class MinDepthOfBinaryTree {
    /**
     * deque可能有很多元素
     * 因此需要for循环进行遍历
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            //for循环遍历该层的所有元素
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left == null && cur.right == null) {
                    return res;
                }
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            //不要忘了加层数
            res++;

        }
        return res;
    }
}
