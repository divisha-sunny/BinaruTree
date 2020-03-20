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
    binaryTree bt = new binaryTree();
    void printGivenLevel(Node node, int level){
        if(node == null){
            return;
        }
        if(level == 1){
            System.out.println(node.getData()+" ");
        }
        else if(level > 1){
            printGivenLevel(node.left, level-1);
            printGivenLevel(node.right, level-1);
        }
    }
    public void levelOrder(Node node){
        int h = bt.heightOfTree(node);
        for(int i = 1 ; i<=h; i++){
            printGivenLevel(node, i);
        }
    }
}
