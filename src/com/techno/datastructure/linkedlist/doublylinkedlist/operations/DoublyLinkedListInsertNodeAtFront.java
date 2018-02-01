package com.techno.datastructure.linkedlist.doublylinkedlist.operations;

/**
 * @author Vaishno Upadhyay
 * @since 28:01:2018:04:40
 * @apiNote Inserting Node at first Position in DoublyLinkedList.
 */
public class DoublyLinkedListInsertNodeAtFront {
    Node head;

    static class Node{
        Node next,prev;
        int data;

        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
       if(head != null){
           head.prev = newNode;
       }
        head = newNode;


    }

    public static void main(String[] args) {
        DoublyLinkedListInsertNodeAtFront doublyLinkedListInsertNodeAtFront = new DoublyLinkedListInsertNodeAtFront();
        doublyLinkedListInsertNodeAtFront.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        doublyLinkedListInsertNodeAtFront.head.next = second;

        second.next = third;
        second.prev = doublyLinkedListInsertNodeAtFront.head;

        third.prev = second;

        System.out.println(doublyLinkedListInsertNodeAtFront.head);
        doublyLinkedListInsertNodeAtFront.addFirst(5);
        System.out.println(doublyLinkedListInsertNodeAtFront.head);
    }
}
