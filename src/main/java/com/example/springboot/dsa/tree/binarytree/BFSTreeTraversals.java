package com.example.springboot.dsa.tree.binarytree;

import com.example.springboot.dsa.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTreeTraversals {
    static BinaryTree  binaryTree=new BinaryTree();
    public static void main(String[] args) {

        binaryTree.addNode(1).addNode(2).addNode(3).addNode(4).addNode(5);
       // new LevelOrderTraversal().levelOrderUsingQueue(binaryTree.getRoot());
        new BFSTreeTraversals().levelOrderUsingRecursion(binaryTree.getRoot());
    }
    public void levelOrderUsingQueue(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode<Integer> temp=queue.peek();
            queue.remove();
            System.out.println("TreeNode<Integer> org.example.DSA.structure.data is :"+temp.getData());
            if(temp.getLeft()!=null){
                queue.add(temp.getLeft());
                System.out.println(temp.getData()+"parent->>>>left child"+temp.getLeft().getData());
            }
            if(temp.getRight()!=null){
                queue.add(temp.getRight());
                System.out.println(temp.getData()+"parent->>>>right child"+temp.getRight().getData());
            }

        }
    }

    public void levelOrderUsingRecursion(TreeNode<Integer> root){
        int height= binaryTree.height(root);
        for (int i=1;i<=height;i++){
            printNodeAtLevel(root,i);
        }
    }
    public void printNodeAtLevel(TreeNode<Integer> root,int height){
        if(root==null){
            return;
        }
        if(height==1){
            System.out.println(root.getData());
        }
        else{
            printNodeAtLevel(root.getLeft(),height-1);
            printNodeAtLevel(root.getRight(),height-1);
        }
    }




}
