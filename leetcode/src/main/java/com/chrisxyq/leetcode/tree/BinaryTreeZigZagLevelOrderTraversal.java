package com.chrisxyq.leetcode.tree;


import com.chrisxyq.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * leetcode 103
 * 二叉树的锯⻮形层序遍历
 * 给定⼀个⼆叉树，返回其节点值的锯⻮形层序遍历。（即先从左往右，再从右往左进⾏下⼀层遍历，以此类
 * 推，层与层之间交替进⾏）。
 */
public class BinaryTreeZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
                //实现z形遍历
                if (level % 2 == 0) {
                    temp.add(cur.val);
                } else {
                    temp.addFirst(cur.val);
                }
            }
            //切换方向
            level++;
            res.add(temp);
        }
        return res;
    }
}
