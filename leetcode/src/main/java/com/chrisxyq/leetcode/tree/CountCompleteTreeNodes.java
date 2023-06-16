package com.chrisxyq.leetcode.tree;


import com.chrisxyq.leetcode.common.TreeNode;

/**
 * leetcode 222
 * 你⼀棵完全⼆叉树的根节点 root，求出该树的节点个数
 * 棵完全⼆叉树的两棵⼦树，⾄少有⼀棵是满⼆叉树：
 */
public class CountCompleteTreeNodes {
    /**
     * 遍历问题的思路
     * 类似于invertTree1的解法
     * 先执行逻辑，然后递归遍历
     *
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        int lh = 0, rh = 0;
        TreeNode cur = root;
        while (cur != null) {
            cur = cur.left;
            lh++;
        }
        cur = root;
        while (cur != null) {
            cur = cur.right;
            rh++;
        }
        if (lh == rh) {
            //说明是满二叉树
            return (int) (Math.pow(2, lh) - 1);
        }
        //不是满二叉树，按照普通逻辑计算
        return 1 + countNodes(root.left) + countNodes(root.right);

    }
}
