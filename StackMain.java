package com.priyanshi.StackAndQueue;

public class StackMain {
    public static void main(String[] args) throws StackException{
        DynamicStack stack = new DynamicStack(5);

        stack.push(24);
        stack.push(45);
        stack.push(2);
        stack.push(7);
        stack.push(18);
        stack.push(84);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
