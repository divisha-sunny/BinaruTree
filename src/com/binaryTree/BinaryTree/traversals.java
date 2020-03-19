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
    public void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.getData()+" ");
    }
    public void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.getData()+" ");
        preorder(node.left);
        preorder(node.right);
    }
}
