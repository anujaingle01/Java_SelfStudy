package com.example.Queue;

import java.util.Queue;

public class Queue_UsingArray {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;


        Queue(int size){        // Constructor
            this.size = size;
            arr = new int[size];
            rear = -1;
        }


        public static boolean isEmpty(){
            return rear == -1;
        }

        public static boolean isFull(){
            return rear == size-1;          // Last Index = Size -1
        }

        //O(1)
        public static void offer(int data){         // add
            if (isFull()){
                System.out.println("Overflow");
                return;
            }
            arr[++rear] = data;                     // arr[0] & ...
        }


//        O(n)
        public static int poll() {                  // remove
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;  // Rear coming Backward
            return front;
        }


//           O(n)
            public static int peek(){               // get
                if (isEmpty()){
                    System.out.println("Empty Queue");
                    return -1;
                }
                return arr[0];
            }


    }



    public static void main(String[] args){

        Queue q = new Queue(5);

        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println(q.poll());     // 1
        System.out.println(q.peek());       // 2
        }



    }

