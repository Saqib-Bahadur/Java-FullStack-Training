package com.dayFive;

public class LinkedListDemo {

    private Node head;

    // Node Class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // =========================
    // ADD OPERATIONS
    // =========================

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(int data) {
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

    // Add At Position (1-based indexing)
    public void addAtPosition(int data, int position) {

        if (position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 1) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position Out of Range");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // =========================
    // DELETE OPERATIONS
    // =========================

    // Delete First
    public void deleteFirst() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
    }

    // Delete Last
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // Delete At Position (1-based indexing)
    public void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 1) {
            deleteFirst();
            return;
        }

        Node current = head;

        for (int i = 1; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Position Out of Range");
            return;
        }

        current.next = current.next.next;
    }

    // =========================
    // PRINT OPERATIONS
    // =========================

    // Normal Print
    public void printList() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Visualization Print
    public void visualPrint() {

        if (head == null) {
            System.out.println("HEAD -> null");
            return;
        }

        Node current = head;

        System.out.print("HEAD ");

        while (current != null) {
            System.out.print("-> [" + current.data + "] ");

            if (current.next != null) {
                System.out.print("-> ");
            }

            current = current.next;
        }

        System.out.println("-> null");
    }

    // =========================
    // MAIN METHOD
    // =========================

    public static void main(String[] args) {

        LinkedListDemo list = new LinkedListDemo();

        // Add Last
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("Initial List:");
        list.visualPrint();

        // Add First
        list.addFirst(5);

        System.out.println("\nAfter addFirst(5):");
        list.visualPrint();

        // Add At Position
        list.addAtPosition(15, 3);

        System.out.println("\nAfter addAtPosition(15, 3):");
        list.visualPrint();

        // Delete First
        list.deleteFirst();

        System.out.println("\nAfter deleteFirst():");
        list.visualPrint();

        // Delete Last
        list.deleteLast();

        System.out.println("\nAfter deleteLast():");
        list.visualPrint();

        // Delete At Position
        list.deleteAtPosition(2);

        System.out.println("\nAfter deleteAtPosition(2):");
        list.visualPrint();
    }
}