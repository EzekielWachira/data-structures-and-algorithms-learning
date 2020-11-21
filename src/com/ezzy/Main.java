package com.ezzy;

import com.ezzy.linked_list.LinkedList;

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

    }
}
