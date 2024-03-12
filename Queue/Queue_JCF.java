package com.example.Queue;
import java.util.*;


public class Queue_JCF {

        public static void main(String args[]) {


//          q is Object of Class LinkedList ...Because Queue is Interface
            Queue<Integer> q = new LinkedList();

//          Queue<Integer> q = new ArrayDeque();

            // Use offer instead add in Queue
            q.offer(1);
            q.offer(2);
            q.offer(3);
            q.offer(4);
            q.offer(5);

            while(!q.isEmpty()) {
                System.out.println(q.peek());       // 1 2 3 4 5
                q.remove();
            }

            // Use Poll instead pop in Queue


        }


    }


