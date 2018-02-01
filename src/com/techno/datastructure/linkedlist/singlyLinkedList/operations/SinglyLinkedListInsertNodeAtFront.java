package com.techno.datastructure.linkedlist.singlyLinkedList.operations;

/**
 *
 * @author Vaishno Upadhyay
 * @since 27:01:2018:09:52
 * @apiNote Inserting a Node at front in the singly Linkedlist
 *
 */

public class SinglyLinkedListInsertNodeAtFront {
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void addFirst(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedListInsertNodeAtFront linkedListInsertNodeAtFront = new SinglyLinkedListInsertNodeAtFront();
        linkedListInsertNodeAtFront.head = new Node(10);
        Node second = new Node(15);
        Node third = new Node(20);
        linkedListInsertNodeAtFront.head.next = second;
        second.next = third;
        System.out.println(linkedListInsertNodeAtFront.head.data);
        linkedListInsertNodeAtFront.addFirst(5);
        System.out.println(linkedListInsertNodeAtFront.head.data);
    }
}
