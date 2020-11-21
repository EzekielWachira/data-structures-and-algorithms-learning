package com.ezzy;

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



    }
}
