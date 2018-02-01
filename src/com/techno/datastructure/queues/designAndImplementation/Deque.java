package com.techno.datastructure.queues.designAndImplementation;

/**
 * @author Vaishno Upadhyay
 * @since 29:01:2018:10:25
 * @apiNote Implementation of Double ended Queue.
 */

public class Deque {
	int front, rear, size;
	int[] dequeArray;

	public Deque(int size) {
		this.size = size;
		front = size;
		rear = -1;
		dequeArray = new int[size];

	}

	public boolean isFull(Deque deque) {
		return ((deque.front - deque.rear) - 1 == 0);
	}

	public boolean isEmpty(Deque deque) {
		return (deque.rear == 0);
	}

	public void insertFront(int element) {
		if (isFull(this)) {
			System.out.println("Deque is full....overflow");
		} else {
			front = front - 1;
			dequeArray[front] = element;

		}
	}

	public void insertRear(int element) {
		if (isFull(this)) {
			System.out.println("Deque is full...overflow");
		} else {
			rear = rear + 1;
			dequeArray[rear] = element;

		}

	}

	public int getFront() {
		if (isEmpty(this)) {
			System.out.println("Deque is empty ....underflow");
		}
		return dequeArray[front];
	}

	public int getRear() {
		if (isEmpty(this)) {
			System.out.println("Deque is empty ....underflow");
		}
		return dequeArray[rear];
	}

	public void deleteFront() {
		if (isEmpty(this)) {
			System.out.println("Deque is empty....underflow");
		} else {
			dequeArray[front] = 0;
			front = front + 1;
		}
	}

	public void deleteRear() {
		if (isEmpty(this)) {
			System.out.println("Deque is empty....underflow");
		} else {
			dequeArray[rear] = 0;
			rear = rear - 1;
		}
	}

	public static void main(String[] args) {
		Deque deque = new Deque(5);
		deque.insertFront(2);
		deque.insertRear(4);
		deque.insertFront(4);
		deque.insertFront(6);
		deque.insertRear(3);
		deque.deleteFront();
		deque.deleteFront();
		deque.deleteRear();
		deque.insertRear(8);
		deque.insertFront(6);

	}
}
