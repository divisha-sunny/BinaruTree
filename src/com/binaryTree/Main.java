package com.binaryTree;

import com.binaryTree.BinaryTree.binaryTree;
import com.binaryTree.BinaryTree.traversals;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
	// Trees are hierarchical data structures. Can be used when you want to store information that naturally forms hierarchy
        // Moderate access for search, insertion and deletion.
        // A tree whose elements have at most 2 children is called binary tree.
        binaryTree tree = new binaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(6);
        tree.root.left.left.left = new Node(3);
        tree.root.right.right = new Node(10);
        tree.root.right.left = new Node(5);
        //max no of nodes at level i = 2*pow(i-1)
        traversals t = new traversals();
        /*System.out.println("In Order before insertion:");
        t.inorder(tree.root);
        tree.insert(tree.root,7);
        tree.insert(tree.root,4);
        System.out.println("Inorder after insertion:");
        t.inorder(tree.root);
        tree.delete(tree.root, 5);
        System.out.println("Inorder after deleting");
        t.inorder(tree.root);*/
        System.out.println("Height of the tree: "+tree.heightOfTree(tree.root));

    }
}
