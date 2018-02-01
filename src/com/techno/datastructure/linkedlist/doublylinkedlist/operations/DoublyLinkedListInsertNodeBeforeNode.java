package com.techno.datastructure.linkedlist.doublylinkedlist.operations;

/**
 * @author Vaishno Upadhyay
 * @since 28:01:2018:07:07
 * @apiNote Inserting a Node before a given node in doubly Linked List.
 */

public class DoublyLinkedListInsertNodeBeforeNode {
    Node head;

    static class Node{
        Node next, prev;
        int data;

        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public void insertBefore(Node nextNode,int data){
        if(nextNode == null){
            System.out.println("Given node can not be null....");
        }else{
            Node newNode = new Node(data);

            if(nextNode == head){
                 head = newNode;
            }else {
                newNode.prev = nextNode.prev;
                newNode.next = nextNode;
                nextNode.prev.next = newNode;



        }

        }

    }


    public static void main(String[] args) {
        DoublyLinkedListInsertNodeBeforeNode doublyLinkedListInsertNodeBeforeNode = new DoublyLinkedListInsertNodeBeforeNode();
        doublyLinkedListInsertNodeBeforeNode.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        doublyLinkedListInsertNodeBeforeNode.head.next = second;
        second.next = third;
        third.next = fourth;
        second.prev = doublyLinkedListInsertNodeBeforeNode.head;
        third.prev = second;
        fourth.prev = third;
        doublyLinkedListInsertNodeBeforeNode.insertBefore(second, 5);

    }
}
