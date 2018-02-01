package com.techno.datastructure.linkedlist.circularlinkedlist.operations;

/**
 * @author Vaishno Upadhyay
 * @since 28:01:2018:11:34
 * @apiNote Inserting Node in Singly CircularLinkedlist in sorted order.
 */
public class SortedInsertInSinglyCircularLinkedList {
    Node head;

    static class Node{
        Node next;
        int data;

        public Node(int data){
           this.data = data;
           next = null;
        }
    }

    public void insert(Node node){
       Node current = head, previous =null;
       if(node == null){
           System.out.println("node can not be null...");
       }else{
           if(current == null){
               node.next = node;
               head = node;
           }else {
               while(current.next != head && node.data >= current.data){
                   previous = current;
                   current = current.next;
               }

               if(current.next == head){
                   current.next = node;
                   node.next = head;
               }else{
                   previous.next = node;
                   node.next = current;
               }
           }


           }
    }

    public static void main(String[] args) {
        SortedInsertInSinglyCircularLinkedList sortedInsertInSinglyCircularLinkedList = new SortedInsertInSinglyCircularLinkedList();
        sortedInsertInSinglyCircularLinkedList.head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(40);
        Node fourth = new Node(50);
        sortedInsertInSinglyCircularLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = sortedInsertInSinglyCircularLinkedList.head;
        sortedInsertInSinglyCircularLinkedList.insert(new Node(30));
        System.out.println(sortedInsertInSinglyCircularLinkedList.head);


    }
}
