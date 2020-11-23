package com.ezzy.queue;

import java.util.*;

public class PriorityQueue<T extends Comparable<T>> {
    //number of elements currently in the heap
    private int heapSize = 0;
    //internal capacity of the heap
    private int heapCapacity = 0;
    //dynamic list to keep track of elements inside the heap
    private List<T> heap = null;
    //map to keep track of possible indices an element occurs in the heap
    private Map<T, TreeSet<Integer>> map = new HashMap<>();

    public PriorityQueue(){
        this(1);
    }

    public PriorityQueue(int size){
        heap = new ArrayList<>(size);
    }

    //construct a priority queue using heapify
    public PriorityQueue(T[] elements){
        heapSize = heapCapacity = elements.length;
        heap = new ArrayList<T>(heapCapacity);
        //place elements on the heap
        for (int i = 0; i < heapSize; i++){

            heap.add(elements[i]);
        }

        //heapify process O(n)
        for (int i = Math.max(0, (heapSize / 2) - 1); i >= 0; i--){

        }
    }

    //construct a priority queue O(nlog(n))
    public PriorityQueue(Collection<T> elements){
        this(elements.size());
        for (T element: elements) {
            //
        }
    }

    public boolean isEmpty(){
        return heapSize == 0;
    }

    public void clear(){
        for (int i = 0; i < heapCapacity; i++){
            heap.set(i, null);
        }
        heapSize = 0;
        map.clear();
    }

    public int size(){
        return heapSize;
    }

    public T peek(){
        if (isEmpty()) return null;
        return heap.get(0);
    }

    public T poll(){

    }

    public boolean contains(T element){
//        for (int i = 0; i < heapCapacity; i++){
//            if (heap.contains(element)){
//                return true;
//            }
//        }
        if (element == null) return false;
        return map.containsKey(element);
    }

    public void add(T element){
        if (element == null) throw new IllegalArgumentException();

        if (heapSize < heapCapacity){
            heap.set(heapSize, element);
        } else {
            heap.add(element);
            heapCapacity++;
        }



    }

    //checks if node i <= node j
    private boolean less(int i, int j){
        T node1 = heap.get(i);
        T node2 = heap.get(j);
        return node1.compareTo(node2) <= 0;
    }

    //swim the node up O(log(n))
    private void swim(int k){
        //get the parent
        int parent = (k - 1) / 2;

        //keep swimming up the node while still not the root node
        while (k > 0 && less(k, parent)){

            k = parent;
            parent = (k - 1) / 2;
        }
    }

    private void sink(int k){
        while (true){
            int left = 2 * k + 1;
            int right = 2 * k + 2;
            int smallest = left;

            if (right < heapSize && less(right, left)){
                smallest = right;
            }
            if (left >= heapSize || less(k, smallest)){
                break;
            }

            k = smallest;
        }
    }

    private void swap(int i, int j){
        T i_element = heap.get(i);
        T j_element = heap.get(j);

        heap.set(i, j_element);
        heap.set(j, i_element);

    }

     

}
