package com.ezzy.linked_list;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void addLast(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if (current.value == item){
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    private boolean isEmpty(){
        return first == null;
    }

    // addFirst()
    // addLast()
    // deleteFirst()
    // deleteLast()
    // contains()
    // indexOf()
}
