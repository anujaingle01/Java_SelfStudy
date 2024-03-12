package com.example.Stack;


//stack using Linked List
public class Stack_LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }



    static class Stack {

        // Initial value of head = null
         public Node head = null;

         public boolean isEmpty() {
            return head == null;
        }

        // push = Adding Data in Stack
         public void push(int data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop = Deleting Data from Stack
         public int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        // peek = Getting Data Value from Stack
        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }


    public static void main(String args[]) {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}