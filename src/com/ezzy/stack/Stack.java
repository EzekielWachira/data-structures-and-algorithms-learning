package com.ezzy.stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterable<T> {

    private LinkedList<T> linkedList = new LinkedList<T>();

    public Stack() { }

    public Stack(T firstElement){
        push(firstElement);
    }

    public int size(){
        return linkedList.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int indexOf(Object obj){
        for (int i = 0; i < linkedList.size(); i++){
            if (obj.equals(linkedList.get(i))) return i;
        }
        return -1;
    }

    public void push(T element){
        linkedList.push(element);
    }

    public T pop(){
        if (isEmpty()) throw new EmptyStackException();
        return linkedList.removeLast();
    }

    public T peek(){
        if (isEmpty()) throw new EmptyStackException();
        return linkedList.peek();
    }

    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }
}
