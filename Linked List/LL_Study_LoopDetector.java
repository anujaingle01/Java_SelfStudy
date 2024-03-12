package com.example.LinkedListStudy;

import java.util.*;

public class LL_Study_LoopDetector {
    static class Node {                     // Nested Class
        Node next;
        Node(){                             // Adding Data to List
            this.next= null;
        }
    }

    static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
//    LinkedList list = new LinkedList();

        Node head = new Node();

        // T = hasCycle
        // F = has NotCycle
        Boolean ans = hasCycle(head);
        System.out.println("True - Has Cycle   &   False - Not a Cycle");
        System.out.println("Answer = "+ans);
    }
    }



