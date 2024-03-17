package com.priyanshi.StackAndQueue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0; // pointer pointing towards the end where new element will be inserted
    protected int front = 0;
    private int size = 0;

    public CircularQueue() { // when nothing is passed
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; // check whether ptr is at the last index
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception { // takes O(N) time
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception { // O(1)
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }

        return data[front];
    }

    public void display() { // O(N)
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
