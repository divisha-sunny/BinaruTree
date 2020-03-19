package com.binaryTree;

public class Node {
    int data;
    public Node left, right;

    public Node(int item){
        data = item;
        left=right=null;
    }
    public int getData()
    {
        return data;
    }
}
