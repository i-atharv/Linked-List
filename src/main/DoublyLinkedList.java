package main;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.addFirst(5);
        l.addFirst(10);
        l.printList();
        System.out.println();
        l.addFirst(15);
        l.addFirst(20);
        l.printList();
        System.out.println();
        l.deleteFirst();
        l.printList();
        System.out.println();
        l.deleteLast();
        l.printList();
        System.out.println();
        l.addLast(45);
        l.printList();
    }

    void addFirst(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        head = head.next;
        head.previous = null;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node last = head;
        Node prev = head;
        while (last.next != null) {
            prev = last;
            last = last.next;
        }
        prev.next = null;
        prev.previous = null;
    }

    void addLast(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        newNode.previous = last;
        last.next = newNode;

    }

    void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node last = head;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
    }

    class Node {
        int data;
        Node next;
        Node previous;

        Node(int d) {
            data = d;
            next = null;
            previous = null;
        }
    }
}
