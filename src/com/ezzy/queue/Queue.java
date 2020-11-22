package com.ezzy.queue;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> implements Iterable<T> {

    LinkedList<T> list = new LinkedList<T>();

    public Queue() { }

    public Queue(T firstElement){
        add(firstElement);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T peek(){
        if (isEmpty()) throw new RuntimeException("Empty queue");
        return list.peekFirst();
    }

    public T poll(){
        if (isEmpty()) throw new RuntimeException("Empty queue");
        return list.removeFirst();
    }

    public void add(T element){
        list.addLast(element);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
