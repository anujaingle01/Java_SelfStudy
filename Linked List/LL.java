//   Linked List_Study from Video

package com.example.LinkedListStudy;

import java.util.*;                 // * == All Packages

 class LL {
    Node head;
    private int size;

    LL(){                           // Class Constructor
        size=0;
    }
    public class Node {              // Nested Class
       String data;
       Node next;

       Node(String data) {              // Adding Data to List
           this.data = data;
           next = null;
           size++;
       }

//       Node(int num) {
//           this.num = num;
//           this.next = null;
//           size++;
//       }
   }

       public void addFirst(String data) {             // addFirst
           Node newNode = new Node(data);

           if (head == null) {
               head = newNode;
               return;
           }

           newNode.next = head;
           head = newNode;
       }

       public void addLast(String data) {              // addLast
           Node newNode = new Node(data);

           if (head == null) {
               head = newNode;
               return;
           }

           Node currNode = head;
           while (currNode.next != null) {
               currNode = currNode.next;
           }
           currNode.next = newNode;
       }

//    public void addLast(Integer num) {              // addLast
//        Node newNode = new Node(num);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node currNode = head;
//        while (currNode.next != null) {
//            currNode = currNode.next;
//        }
//        currNode.next = newNode;
//    }

       void printList() {                                       // printList

            if (head == null) {
                System.out.println("List is Empty");
                return;
            }

            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + " --> ");
                currNode = currNode.next;
            }
            System.out.println("NULL");
        }



       public void removeFirst() {                          // removeFirst
           if (head == null) {
               System.out.println("Empty List - Nothing to Delete");
               return;
           }
           size--;
           head = head.next;

       }

       public void removeLast() {                           // removeLast
           if (head == null) {
               System.out.println("Empty List - Nothing to Delete");
               return;
           }

           size--;
           if (head.next == null) {
               head = null;
               return;
           }

           Node SecondLast = head;
           Node LastNode = head.next;

           while (LastNode.next != null) {
               LastNode = LastNode.next;
               SecondLast = SecondLast.next;
           }
           SecondLast.next = null;
       }



    public int getSize() {                                   // getsize
        return size;
    }

    public void reverseIterate() {

        if (head == null || head.next == null) {
            return ;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }


    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }



        public static void main(String[] args) {

//          LinkedList<String> list =new LinkedList<>();
            LL list = new LL();


            list.addFirst("a");
            list.addFirst("is");
            list.printList();

            list.removeLast();
            list.printList();

            list.addLast("a");
            list.printList();

            list.addFirst("this");
            list.printList();

            list.removeFirst();
            list.printList();

            list.addLast("list");
            list.printList();

            list.addFirst("this");
            list.printList();

            System.out.println(list.getSize());



            // To Reverse List =
            LL numb =new LL();
//            LinkedList<Integer> numb = new LinkedList<>();

            numb.addLast("1");
            numb.addLast("2");
            numb.addLast("3");
            numb.addLast("4");

            System.out.println();
            numb.printList();

//            numb.reverseIterate();                // ERROR - Function Not Working
//            numb.printList();


            numb.head = numb.reverseRecursive(numb.head);
            numb.printList();

        }
    }


