package com.example.springboot.interviews.ola;


import com.example.springboot.dsa.tree.bst.BinarySearchTreeImpl;

public class SortTheBst {
    public static void main(String[] args) {
        // 1,2,4,3,7,8,6
        BinarySearchTreeImpl bst=new BinarySearchTreeImpl();
        bst.addNode(1)
                .addNode(2)
                .addNode(4)
                .addNode(3)
                .addNode(7)
                .addNode(8)
                .addNode(6);
        bst.inorderTraversal();

        bst.search(8);
    }
}
