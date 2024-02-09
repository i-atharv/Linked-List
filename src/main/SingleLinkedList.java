package main;

public class SingleLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    void addFirst(int d)
    {
        Node newNode= new Node(d);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
     void printList()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node last=head;
        while (last!=null)
        {
            System.out.print(last.data+" ");
            last=last.next;
        }
    }

    void addLast(int d)
    {
        Node newNode= new Node(d);
        if(head==null) {
            head = newNode;
            return;
        }
        Node last=head;
        while (last.next!=null)
            last=last.next;
        last.next=newNode;
    }

    void deleteFirst()
    {

        if(head==null) {
            System.out.println("List Is Empty");
            return;
        }
        head=head.next;
    }
    void deleteLast(){
        if(head==null) {
            System.out.println("List Is Empty");
            return;
        }
        Node last=head;
        Node previous=head;
        while(last.next!=null)
        {
            previous=last;
            last=last.next;
        }
        previous.next=null;
    }

    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.printList();
        s.addFirst(35);
        s.addFirst(65);
        s.addFirst(85);
        s.printList();
        System.out.println();
        s.addLast(105);
        s.printList();
        s.deleteFirst();
        System.out.println();
        s.printList();
        System.out.println();
        s.deleteLast();
        s.printList();
    }
}