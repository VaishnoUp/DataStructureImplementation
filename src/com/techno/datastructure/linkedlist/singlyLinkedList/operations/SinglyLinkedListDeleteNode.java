package com.techno.datastructure.linkedlist.singlyLinkedList.operations;

/**
 * @author Vaishno Upadhyay
 * @since 27:01:2018:11:21
 * @apiNote Deleting Node in singly Linked List.
 */
public class SinglyLinkedListDeleteNode {
    Node head;

    static class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            next = null;

        }
    }


    public void deleteNode(int dataKey){
        Node temp = head, previous = null;
        if(temp != null && temp.data == dataKey){
            head = temp.next;
        }else {
            while (temp != null && temp.data != dataKey){
                previous = temp;
                temp = temp.next;
            }
            if(temp == null){
                System.out.println("sorry key not matched in the linked list..");
                return;
            }
            previous.next = temp.next;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedListDeleteNode singlyLinkedListDeleteNode = new SinglyLinkedListDeleteNode();
        singlyLinkedListDeleteNode.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        singlyLinkedListDeleteNode.head.next = second;
        second.next = third;
        third.next = fourth;
        singlyLinkedListDeleteNode.deleteNode(30);

    }
}
