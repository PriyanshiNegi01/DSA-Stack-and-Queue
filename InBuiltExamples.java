package com.priyanshi.StackAndQueue;

import java.util.*;

public class InBuiltExamples {

    public static void main(String[] args) {

//        // STACK --> LIFO
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(24);
//        stack.push(45);
//        stack.push(2);
//        stack.push(7);
//        stack.push(18);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        // QUEUE --> FIFO
        // you can only insert from the back and remove from the front
        // Queue is an interface in Java
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(6);
        queue.add(4);
        queue.add(16);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.peek()); // prints the head of the queue
        // Internal implementation of LL has both the head and tail and
        // so it's efficient to directly add elements from the back

        // Doubly Ended Queue (Deque): you can insert and remove from both the sides
        // here, the counter is on both the ends

        // DEQUE interface
        Deque<Integer> deque = new ArrayDeque<>();

        // ArrayDeque class allows us to create an object and implements the methods that are present in Deque interface
        // it has a resizable array
        // Array deque has no capacity restrictions
        // This class is faster than Stack when used as a stack
        // and faster than LL when used as a queue
        // Reason: it promotes insertion and deletion from both the ends
        // null elements are not allowed
        // very useful for TREES
        deque.add(88);
        deque.addLast(75);
        deque.removeFirst();
        

    }
}
