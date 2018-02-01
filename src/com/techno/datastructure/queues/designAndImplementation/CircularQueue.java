package com.techno.datastructure.queues.designAndImplementation;

/**
 * 
 * @author Vaishno Upadhyay
 * @since 30:01:2018:12:12
 * @apiNote Implementing Circular Queue.
 *
 */
public class CircularQueue {
	int front, rear, size;
	int[] queueArray;

	public CircularQueue(int size) {
		this.size = size;
		front = 0;
		rear = -1;
		queueArray = new int[size];
	}

	public boolean isFull(CircularQueue circularQueue) {
		if (circularQueue.front == 0 && circularQueue.rear == size - 1) {
			return true;
		} else if (front != 0 && rear - front - 1 == 0) {
			return true;
		}
		return false;
	}

	public boolean isEmpty(CircularQueue circularQueue) {
		return false;
	}

	public void insert(int element) {
		if (isFull(this)) {
			System.out.println("Queue is full....overflow");
		} else {
			if (rear == size - 1 && front != 0) {
				rear = -1;
			}
			rear = rear + 1;
			queueArray[rear] = element;
		}

	}

	public void delete() {
		if (isEmpty(this)) {
			System.out.println("Queue is empty....underflow");
		} else {
			queueArray[front] = 0;
			front = front + 1;
		}

	}

	public static void main(String[] args) {
		CircularQueue circularQueue = new CircularQueue(5);
		circularQueue.insert(3);
		circularQueue.insert(4);
		circularQueue.insert(6);
		circularQueue.insert(7);
		circularQueue.insert(8);
		circularQueue.delete();
		circularQueue.insert(8);
	}

}
