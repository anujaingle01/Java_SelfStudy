package com.example.LinkedListStudy;

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(Node next, int val) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    static int length(Node head) {          // Size
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }


    // Remove Nth Node From End
     static Node removeNthFromEnd(Node head, int n) {             // Return Type  =  Node
        if (head == null) {
            return null;
        }

        int len = length(head);
        if (n > len) {                              //   2 > 5
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;                   // Returns n = 4      ( ? ..... May be  )
    }



    public static void printList(Node head) {               // To Print
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        s.printList(head);

        Node ans = removeNthFromEnd(head, 2);          // n = 2        Remove Last 2nd Value from End

        printList(ans);
    }

}

