package com.example.springboot.dsa.tree.binarytree;

import com.example.springboot.dsa.tree.TreeNode;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private TreeNode<Integer> root;

    public BinaryTree(int key){

        root=new TreeNode<>(key);
    }

    public BinaryTree(){
        root=null;
    }

    public BinaryTree addNode(int data){
        if(root==null){

            root=new TreeNode<>(data);
            return this;
        }
        Queue<TreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode<Integer> temp=queue.peek();
            queue.remove();
            if(temp.getLeft()==null){
                temp.setLeft(new TreeNode<Integer>(data));
                return this;
            }
            else{
                queue.add(temp.getLeft());
            }
            if(temp.getRight()==null){
                temp.setRight(new TreeNode<Integer>(data));
                return this;
            }else{
                queue.add(temp.getRight());
            }
        }
        return this;
    }

        public int height(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int lHeight=height(root.getLeft());
        int rHeight=height(root.getRight());
        if(lHeight>rHeight){
            return lHeight+1;
        }else{
            return rHeight+1;
        }

        }

    public TreeNode<Integer> getRoot(){
        return this.root;
    }



}
