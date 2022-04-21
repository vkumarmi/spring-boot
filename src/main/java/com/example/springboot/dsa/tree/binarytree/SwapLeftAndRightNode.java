package com.example.springboot.dsa.tree.binarytree;

import com.example.springboot.dsa.tree.TreeNode;

public class SwapLeftAndRightNode {

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.addNode(1)
                .addNode(2)
                .addNode(3)
                .addNode(4)
                .addNode(5)
                .addNode(6)
                .addNode(7)
                .addNode(8);

        TreeNode<Integer> temp=bt.getRoot();
        LevelOrderTraversal levelOrderTraversal=new LevelOrderTraversal();
        levelOrderTraversal.levelOrderUsingQueue(temp);
        swapLeftAndRightNode(temp);
        levelOrderTraversal.levelOrderUsingQueue(temp);

    }
    public static void swapLeftAndRightNode(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        if(root.getLeft()==null && root.getRight()==null){
            return ;
        }
        TreeNode<Integer> temp;

            temp=root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(temp);
            swapLeftAndRightNode(root.getLeft());
            swapLeftAndRightNode(root.getRight());



    }
}

