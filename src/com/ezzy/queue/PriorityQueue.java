package com.ezzy.queue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class PriorityQueue<T extends Comparable<T>> {
    //number of elements currently in the heap
    private int heapSize = 0;
    //internal capacity of the heap
    private int heapCapacity = 0;
    //dynamic list to keep track of elements inside the heap
    private List<T> heap = null;
    //map to keep track of possible indices an element occurs in the heap
    private Map<T, TreeSet<Integer>> map = new HashMap<>();
    
}
