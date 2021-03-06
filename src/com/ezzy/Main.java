package com.ezzy;

import com.ezzy.arrays.Array;
import com.ezzy.linked_list.DoublyLinkedList;
import com.ezzy.linked_list.LinkedList;
import com.ezzy.queue.PriorityQueue;
import com.ezzy.queue.Queue;
import com.ezzy.stack.Stack;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //LINKED LIST IMPLEMENTATION
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

         list.addFirst(40);
         list.addFirst(50);

        System.out.println(list.indexOf(20));
        list.deleteFirst();
        System.out.println(list.contains(50));
        list.deleteLast();
        System.out.println(list.contains(30));

        // STACK IMPLEMENTATION
        System.out.println("\nSTACK");
        var stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        stack.push(89);
        System.out.println(stack.peek());
        System.out.println(stack.indexOf(20));

        //ARRAY IMPLEMENTATION
        System.out.println("ARRAYS");
        Array<String> array = new Array<>(2);
        array.add("Tokyo");
        array.add("London");
        System.out.println(array.size());
        array.add("Nairobi");
        System.out.println(array.size());
        System.out.println(array.indexOf("Tokyo"));
        System.out.println(array.contains("London"));
        System.out.println(array.toString());
        array.removeAt(0);
        System.out.println(array.get(0));
        System.out.println(array.toString());
        array.set(0, "Moscow");
        System.out.println(array.toString());
        System.out.println(array.iterator().next());

        // DOUBLY LINKED LIST IMPLEMENTATION
        var doublyList = new DoublyLinkedList<String>();
        System.out.println("\n DOUBLY LINKED LIST");
        doublyList.add("Hanoi");
        doublyList.addFirst("Melbourne");
        doublyList.addLast("Sydney");
        System.out.println(doublyList.peekFirst());
        System.out.println(doublyList.peekLast());
        System.out.println(doublyList.indexOf("Hanoi"));
        System.out.println(doublyList.contains("Sydney"));
        System.out.println(doublyList.size());

        //QUEUE IMPLEMENTATION
        var queue = new Queue<Integer>();
        System.out.println("\nQUEUE");
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());

        //PRIORITY QUEUE IMPLEMENTATION
        var pQueue = new PriorityQueue<Integer>();
        System.out.println("\nPRIORITY QUEUE");
        pQueue.add(11);
        pQueue.add(12);
        pQueue.add(13);
        pQueue.add(14);
        System.out.println("\nIs min heap??? " + pQueue.isMeanHeap(16));
        System.out.println(pQueue.peek());
        pQueue.poll();
        System.out.println(pQueue.peek());


    }
}
