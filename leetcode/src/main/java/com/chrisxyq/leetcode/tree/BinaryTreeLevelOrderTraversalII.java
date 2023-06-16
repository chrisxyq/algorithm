package com.chrisxyq.leetcode.tree;

import com.chrisxyq.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * leetcode 107
 * 二叉树层序遍历II
 * 定⼀个⼆叉树，返回其节点值⾃底向上的层序遍历（即按从叶⼦节点所在层到根节点所在的层，逐层从左
 * 向右遍历）。
 */
public class BinaryTreeLevelOrderTraversalII {
    /**
     * 注意temp的初始化以及添加的时机
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                temp.add(cur.val);
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            res.addFirst(temp);
        }
        return res;
    }

}
