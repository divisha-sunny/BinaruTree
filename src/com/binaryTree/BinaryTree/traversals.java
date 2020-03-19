package com.binaryTree.BinaryTree;

import com.binaryTree.Node;

public class traversals {

    public void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.println(node.getData()+" ");
        inorder(node.right);
    }
}
