package com.techno.datastructure.linkedlist.singlyLinkedList.operations;

/**
 * 
 * @author Vaishno Upadhyay
 * @since 30:01:2018:01:20
 * @apiNote Searching an element in the LinkedList.
 *
 */

public class SearchinfElementInLinkedList {
	Node head;

	static class Node {
		Node next;
		int element;

		public Node(int element) {
			this.element = element;
			next = null;
		}

	}

	public boolean isEmpty() {
		return head == null;

	}

	public boolean search(int element) {
		Node temp;
		if (isEmpty()) {
			System.out.println("LinkedList is empty....underflow");
		} else {
			temp = head;
			while (temp.element != element) {
				temp = temp.next;
			}
			if (temp.element == element) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		SearchinfElementInLinkedList searchinfElementInLinkedList = new SearchinfElementInLinkedList();
		searchinfElementInLinkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		searchinfElementInLinkedList.head.next = second;
		second.next = third;
		System.out.println(searchinfElementInLinkedList.search(3));
	}

}
