package com.techno.datastructure.linkedlist.singlyLinkedList.operations;

/**
 * @author Vaishno Upadhyay
 * @since 27:01:2018:10:09
 */

public class SinglyLinkedListInsertNodeAtEnd {
    Node head;

    static class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    /**
     * @param data
     */
    public void addLast(int data){
        Node lastNode = new Node(data);
        if(head == null){
         head = new Node(data);
         return;
        }else {
            lastNode.next = null;
            Node last = head ;
            while (last.next != null){
                last = last.next;
            }
            last.next = lastNode;

        }
    }

    public static void main(String[] args) {
        SinglyLinkedListInsertNodeAtEnd singlyLinkedListInsertNodeAtEnd = new SinglyLinkedListInsertNodeAtEnd();
        singlyLinkedListInsertNodeAtEnd.head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        singlyLinkedListInsertNodeAtEnd.head.next = second;
        second.next = third;
        System.out.println(singlyLinkedListInsertNodeAtEnd.head);
        singlyLinkedListInsertNodeAtEnd.addLast(40);
        System.out.println(singlyLinkedListInsertNodeAtEnd.head);
    }
}
