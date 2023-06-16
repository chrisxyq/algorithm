package com.chrisxyq.leetcode.tree;

import com.chrisxyq.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 145
 * 后序遍历
 */
public class PostOrderTraversal {
    List<Integer> res=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if(root==null){
            return;
        }
        traverse(root.left);
        traverse(root.right);
        res.add(root.val);
    }

}
