package com.example.Queue;


public class  Queue_UsingLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) {                    // Constructor
            this.data = data;
            next = null;
        }
    }


    static class Queue {
        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty() {
            return head == null && tail == null;
        }


//        O(1)
        public static void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

//        O(1)
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            //single node
            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

//        O(1)
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }


    }


        public static void main(String args[]) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while(!q.isEmpty()) {
            System.out.println(q.peek());       // To Get from Start
            q.remove();                         // To Remove from Start
        }
    }


}



