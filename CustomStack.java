package com.priyanshi.StackAndQueue;

public class CustomStack {
    // Stack has an array internally
    protected int[] data;
    // let's assume it is not a dynamic stack
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() { // when nothing is passed
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        // if array is full, out of bound error will occur
        if (isFull()) {
            System.out.println("Stack is full!");
            return false;
        }

        ptr++; // first increase the ptr
        data[ptr] = item; // then add the item
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        // OR
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // check whether ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1; // check whether ptr is at -1
    }
}
