package com.priyanshi.StackAndQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(4);
//        queue.insert(16);
//        queue.insert(1);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(4);
        queue.insert(16);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();
    }
}
