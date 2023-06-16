package com.chrisxyq.leetcode.tree;

import com.chrisxyq.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. ⼆叉树的中序遍历
 */
public class InorderTraversal {
    List<Integer> res=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if(root==null){
            return;
        }
        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }
}
