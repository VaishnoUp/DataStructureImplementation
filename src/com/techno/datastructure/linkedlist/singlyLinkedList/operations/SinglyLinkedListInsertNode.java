package com.techno.datastructure.linkedlist.singlyLinkedList.operations;

/**
 * @author Vaishno Upadhyay
 * @since 27:01:2018:11:00
 * @apiNote Inserting Node after a given node
 */
public class SinglyLinkedListInsertNode {
    Node head;

    static class Node{
        Node next;
        int data;

        public Node(int data){
            this.data =data;
            next = null;
        }
    }

    public void appendNode(Node previousNode, int data){
        if(previousNode == null){
            System.out.println("the previous node can not be null...");
            return;
        }
        Node node = new Node(data);
        node.next = previousNode.next;
        previousNode.next = node;

    }

    public static void main(String[] args) {
        SinglyLinkedListInsertNode singlyLinkedListInsertNode = new SinglyLinkedListInsertNode();
        singlyLinkedListInsertNode.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        singlyLinkedListInsertNode.head.next = second;
        second.next = third;
        System.out.println(singlyLinkedListInsertNode.head);
        singlyLinkedListInsertNode.appendNode(second,25);
        System.out.println(singlyLinkedListInsertNode.head);
    }
}
