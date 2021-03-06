package com.ezzy.linked_list;

import java.util.NoSuchElementException;

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

    public void deleteFirst(){
        if (isEmpty()){
            throw  new NoSuchElementException();
        }

        if (first == last){
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }

    public void deleteLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        if (first == last){
            first = last = null;
            return;
        }

        var previous = returnPrevious(last);
        last = previous;
        last.next = null;

    }

    private Node returnPrevious(Node node){
        var current = first;
        while (current != null){
            if (current.next == node){
                return current;
            }
            current = current.next;
        }
        return null;
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
