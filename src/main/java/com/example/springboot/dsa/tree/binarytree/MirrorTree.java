package com.example.springboot.dsa.tree.binarytree;

import com.example.springboot.dsa.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {
    static BinaryTree bt = new BinaryTree();

    public TreeNode<Integer> mirrorTreeRecursive(TreeNode<Integer> root) {
        if (root == null) {
            return root;
        }
        TreeNode<Integer> left = mirrorTreeRecursive(root.getLeft());
        TreeNode<Integer> right = mirrorTreeRecursive(root.getRight());
        TreeNode<Integer> temp = left;
        left = right;
        right = temp;
        return root;
    }

    public TreeNode<Integer> mirrorTreeIterative(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);
        TreeNode<Integer> current;
        TreeNode<Integer> temp;
        while (!queue.isEmpty()){
            current=queue.poll();
            TreeNode<Integer> left=current.getLeft();
            TreeNode<Integer> right=current.getRight();
            temp=left;
            left=right;
            right=temp;
            current.setLeft(left);
            current.setRight(right);
            if(current.getLeft()!=null){
                queue.add(current.getLeft());
            }
            if(current.getRight()!=null){
                queue.add(current.getRight());
            }

        }
        return root;
    }
}
