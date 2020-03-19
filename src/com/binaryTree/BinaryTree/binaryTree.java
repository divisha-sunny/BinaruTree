package com.binaryTree.BinaryTree;

import com.binaryTree.Node;

public class binaryTree {
    public Node root;
    binaryTree(int data){
        root = new Node(data);
    }
    public binaryTree(){
        root = null;
    }

    public Node search(Node node, int key){
        if(node==null || node.getData()==key){
            return node;
        }
        if(node.getData() > key){
            return search(node.left, key);
        }
        return search(node.right, key);
    }
}
