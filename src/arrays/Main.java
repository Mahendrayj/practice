package com.kn.arrays;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    int findNthFromEnd(int n) {
        if (head == null || n <= 0) {
            return -1; // Return -1 if the list is empty or n is invalid
        }

        Node slowPtr = head;
        Node fastPtr = head;

        // Move the fast pointer n nodes ahead
        for (int i = 0; i < n; i++) {
            if (fastPtr == null) {
                return -1; // Return -1 if n is greater than the number of nodes
            }
            fastPtr = fastPtr.next;
        }

        // Move both pointers until the fast pointer reaches the end
        while (fastPtr != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        return slowPtr.data;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int numNodes = scanner.nextInt();
            int n = scanner.nextInt();
            LinkedList linkedList = new LinkedList();

            for (int i = 0; i < numNodes; i++) {
                int data = scanner.nextInt();
                linkedList.append(data);
            }

            int result = linkedList.findNthFromEnd(n);
            if (result == -1) {
                System.out.println("none");
            } else {
                System.out.println(result);
            }
        }
        scanner.close();
    }
}
