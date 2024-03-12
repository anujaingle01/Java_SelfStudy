package com.example.Queue;
import java.util.*;


public class Queue_Using2Stacks {

        static class Queue {
            // 2 Stacks  =  s1 & s2
            static Stack<Integer> s1 = new Stack<>();
            static Stack<Integer> s2 = new Stack<>();


            public static boolean isEmpty() {
                return s1.isEmpty();
            }


            public static void add(int data) {
                while(!s1.isEmpty()) {
                    s2.push(s1.pop());      // s1  to  s2
                }
                s1.push(data);
                while(!s2.isEmpty()) {      // s2  to  s1
                    s1.push(s2.pop());
                }
            }


            public static int remove() {
                return s1.pop();
            }


            public static int peek() {
                return s1.peek();
            }
        }


        public static void main(String args[]) {

            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);


            while(!q.isEmpty()) {
                System.out.println(q.peek());            // To Get from Top
                q.remove();                              // To Remove from Top
            }

        }


    }


