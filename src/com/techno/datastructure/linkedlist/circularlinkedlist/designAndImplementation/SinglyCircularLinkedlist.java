package com.techno.datastructure.linkedlist.circularlinkedlist.designAndImplementation;

/**
 * @author Vaishno Upadhyay
 * @since 28:01:2018:11:19
 */

public class SinglyCircularLinkedlist {
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
        SinglyCircularLinkedlist singlyCircularLinkedlist = new SinglyCircularLinkedlist();
        singlyCircularLinkedlist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        singlyCircularLinkedlist.head.next =second;
        second.next= third;
        third.next =fourth;
        fourth.next = singlyCircularLinkedlist.head;
    }
}
