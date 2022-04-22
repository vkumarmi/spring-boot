package com.example.springboot.dsa.tree.binarytree;

import com.example.springboot.dsa.tree.TreeNode;

public class DFSTreeTraversals {
    static BinaryTree bt=new BinaryTree();

    public static void main(String[] args) {

    }

    public void inorderTraversals(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        inorderTraversals(root.getLeft());

        System.out.println(root.getData());

        inorderTraversals(root.getRight());
    }

    public void preOrderTraversals(TreeNode<Integer> root){
        if(root==null){
            return;
        }

        System.out.println(root.getData());

        preOrderTraversals(root.getLeft());

        preOrderTraversals(root.getRight());
    }

    public void postOrderTraversals(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        postOrderTraversals(root.getLeft());

        postOrderTraversals(root.getRight());

        System.out.println(root.getData());
    }
}
