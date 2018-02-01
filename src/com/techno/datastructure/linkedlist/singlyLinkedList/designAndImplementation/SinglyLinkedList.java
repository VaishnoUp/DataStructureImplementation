package com.techno.datastructure.linkedlist.singlyLinkedList.designAndImplementation;

/**
 * @author Vaishno Upadhyay
 * @since 27:01:2018:04:00
 * @apiNote Implementation of Singly Linked List.
 */

public class SinglyLinkedList {
    Node head;

   static class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;
        System.out.println(linkedList.head.next.data);
        System.out.println(linkedList.head.data);
        System.out.println(second.data);
        System.out.println(second.next.data);

    }
}
