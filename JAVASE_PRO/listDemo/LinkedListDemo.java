package com.JAVASE_PRO.listDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
//        stack.addFirst("1");
//        stack.addFirst("2");
//        stack.addFirst("3");
//        stack.addFirst("4");
//        System.out.println(stack);
//        System.out.println(stack.removeFirst());
//        System.out.println(stack.removeFirst());
//        System.out.println(stack.removeFirst());
//        System.out.println(stack.removeFirst());


        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");
        System.out.println(queue);
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());



    }
}
