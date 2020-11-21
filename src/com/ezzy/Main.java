package com.ezzy;

import com.ezzy.arrays.Array;
import com.ezzy.linked_list.LinkedList;
import com.ezzy.stack.Stack;

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
        Stack stack = new Stack(10);
        if (!stack.isFull()){
            stack.push(10);
            stack.push(20);
            stack.push(30);

//            System.out.println(stack.pop());
            System.out.println(stack.getSize());
        }

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

    }
}
