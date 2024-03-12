package com.example.LinkedListStudy;


public class LL_Study_PalindromeCheck {

    class Node {                            // Nested Class
        String val;
        Node next;

        Node( String val) {              // Adding Data to List
            this.val = val;
            this.next = null;
        }
    }

    public Node getMiddle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {

            return true;                        // Is Palindrome
        }

        Node firstHalfEnd = getMiddle(head);
        Node secondHalfFirst = reverse(firstHalfEnd.next);
        Node firstHalfStart = head;
                                                                      
        while (secondHalfFirst != null) {
            if (!secondHalfFirst.val.equals(firstHalfStart.val)) {
                return false;
            }
            secondHalfFirst = secondHalfFirst.next;
            firstHalfStart = firstHalfStart.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LL_Study_PalindromeCheck list = new LL_Study_PalindromeCheck();

        Node head = list.new Node("A");
//        head.val = "A";
        Node second = list.new Node("B");
//        second.val = "B";
        Node third = list.new Node("A");
//        third.val = "A";

        head.next = second;
        second.next = third;

        // T = Palindrome
        // F = Not Palindrome
        Boolean ans = list.isPalindrome(head);
        System.out.println("True - Palindrome   &   False - Not Palindrome");
        System.out.println("Answer = "+ans);
    }
}