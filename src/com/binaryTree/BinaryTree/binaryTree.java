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
    public Node insert(Node node, int key){
        if(node == null){
            node = new Node(key);
        }
        if(key < node.getData()){
            node.left = insert(node.left, key);
        }
        else if(key > node.getData()){
            node.right = insert(node.right, key);
        }
        return node;
    }
}
