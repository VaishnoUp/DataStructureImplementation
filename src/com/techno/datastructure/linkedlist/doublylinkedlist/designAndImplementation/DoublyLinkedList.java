package com.techno.datastructure.linkedlist.doublylinkedlist.designAndImplementation;

/**
 * @author Vaishno Upadhyay
 * @since 28:01:2018:12:40
 * @apiNote Simple implementation of DoublyLinkedList.
 */

public class DoublyLinkedList {
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

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);


        doublyLinkedList.head.next = second;
        second.next = third;
        second.prev = doublyLinkedList.head;
        third.next = fourth;
        third.prev = second;
        fourth.prev = third;

        System.out.println(doublyLinkedList.head);


    }
}
