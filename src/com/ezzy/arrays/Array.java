package com.ezzy.arrays;

import java.util.Iterator;
@SuppressWarnings("unchecked")
public class Array<T> implements Iterable<T> {

    private T [] arr;
    private int length = 0;
    private int capacity = 0;

    public Array(){
        this(16);
    }

    public Array(int capacity){
        if (capacity < 0){
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(int index, T value){
        arr[index] = value;
    }

    public void clear(){
        for (int i = 0; i < capacity; i++){
            arr[i] = null;
            length = 0;
        }
    }

    public void add(T element){
        if (length + 1 >= capacity){
            if (capacity == 0){
                capacity = 1;
            } else {
                capacity *= 2;
            }
            T[] new_arr = (T[]) new Object[capacity];
            for (int i = 0; i < length; i++){
                new_arr[i] = arr[i];
            }
            arr = new_arr;
        }
        arr[length++] = element;
    }

    public T removeAt(int index){
        if (index >= length && index < 0){
            throw new IndexOutOfBoundsException();
        }
        T data = arr[index];
        T[] new_arr = (T[]) new Object[length - 1];
        for (int i = 0, j = 0; i < length; i++, j++){
            if (i == index){
                j--;
            } else {
                new_arr[j] = arr[i];
            }
        }
        arr = new_arr;
        capacity = --length;
        return data;
    }

    public boolean remove(Object obj){
        for (int i = 0; i < length; i++){
            if (arr[i].equals(obj)){
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj){
        for (int i = 0; i < length; i++)
            if (arr[i].equals(obj))
                return i;
            return -1;
    }

    public boolean contains(Object obj){
        return indexOf(obj) != -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < length;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }

    @Override
    public String toString() {
        if (length == 0) return "[]";
        else {
            StringBuilder stringBuilder = new StringBuilder(length).append("[");
            for (int i = 0; i < length - 1; i++){
                stringBuilder.append(arr[i] + ", ");
            }
            return stringBuilder.append(arr[length - 1] + "]").toString();
        }

    }
}
