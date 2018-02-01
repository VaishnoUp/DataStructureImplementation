package com.techno.datastructure.linkedlist.doublylinkedlist.operations;

/**
 * @author Vaishno Upadhyay
 * @since 28:01:2018:05:33
 * @apiNote Inserting a node after a given node in doublyLinkedList.
 */

public class DoublyLinkedListInsertNodeAfterNode {
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

    public void append(Node previous , int data){
        if(previous == null){
            System.out.println("Node can not be null..");
        }else{
            Node node = new Node(data);
            node.next = previous.next;
            previous.next = node;
            node.prev = previous;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListInsertNodeAfterNode doublyLinkedListInsertNodeAfterNode = new DoublyLinkedListInsertNodeAfterNode();
        doublyLinkedListInsertNodeAfterNode.head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(20);
        doublyLinkedListInsertNodeAfterNode.head.next = second;
        second.next = third;
        third.prev = second;
        second.prev = doublyLinkedListInsertNodeAfterNode.head;
        System.out.println(doublyLinkedListInsertNodeAfterNode.head);
        doublyLinkedListInsertNodeAfterNode.append(doublyLinkedListInsertNodeAfterNode.head,30);
    }
}
