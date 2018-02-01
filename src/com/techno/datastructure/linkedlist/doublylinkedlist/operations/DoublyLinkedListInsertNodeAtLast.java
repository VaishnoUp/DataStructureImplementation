package com.techno.datastructure.linkedlist.doublylinkedlist.operations;

/**
 * @author Vaishno Upadhyay
 * @since 28:01:2018:04:55
 * @apiNote Inserting Node at last Position in the doublyLinkedList.
 */
public class DoublyLinkedListInsertNodeAtLast {
    Node head;

     static class Node{
        Node next,prev;
        int data;

        public Node(int data){
            this.data =data;
            next = null;
            prev = null;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node current = head;
        if(current == null){
            newNode = head;
        }else {
            while(current.next != null){
             current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;

        }
    }

    public static void main(String[] args) {
        DoublyLinkedListInsertNodeAtLast last = new DoublyLinkedListInsertNodeAtLast();
        last.head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        last.head.next = second;
        second.next = third;
        third.prev = second;
        second.prev = last.head;
        System.out.println(last.head);
        last.addLast(20);
        System.out.println(last.head);
    }
}
