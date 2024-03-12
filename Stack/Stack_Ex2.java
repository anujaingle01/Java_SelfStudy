package com.example.Stack;
import java.util.*;


//Code to Reverse a Stack
public class Stack_Ex2 {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        // Inserting data from Bottom
        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    // Reversing a Stack
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        // Removing head data line wise - From Top to Bottom
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }



    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverse(stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }



}