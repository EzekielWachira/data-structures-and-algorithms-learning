package com.ezzy.binary_tree;

public class BinarySearchTree<T extends Comparable<T>> {

    private int nodeCount = 0;

    private Node root = null;

    private class Node{
        T data;
        Node left, right;

        public Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public int size(){

    }

    public boolean add(T elemement) {

    }

    private Node add(Node node, T element){
        
    }

}
