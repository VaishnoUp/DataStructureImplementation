package com.techno.datastructure.queues.designAndImplementation;

/**
 * 
 * @author Vaishno Upadhyay
 * @since 29:01:2018:05:35
 * @apiNote PriorityQueue Implementation.
 *
 */
public class PriorityQueue {
	int front, size, priority, rear;
	int[][] priorityQueue;

	public PriorityQueue(int size) {
		this.size = size;
		front = rear = 0;
		priorityQueue = new int[2][size];
	}

	public boolean isFull(PriorityQueue queue) {
		return (queue.rear == queue.size - 1);

	}

	public boolean isEmpty(PriorityQueue queue) {
		return queue.rear == -1;

	}

	public void insert(int element, int priority) {
		if (isFull(this)) {
			System.out.println("Queue is full...overflow");
		} else {
			priorityQueue[0][rear] = element;
			priorityQueue[1][rear] = priority;
			rear = rear + 1;
		}

	}

	public int getHighestPriority() {
		if (isEmpty(this)) {
			System.out.println("Queue is empty....underflow");
		} else {
			int temp = 0;
			priority = priorityQueue[1][0];
			for (int i = 1; i < rear; i++) {
				temp = priorityQueue[1][i];
				if (temp > priority) {
					priority = temp;
					front = i;
				}
			}
			int element = priorityQueue[0][front];
			return element;
		}
		return 0;
	}

	public void deleteHighestPriority() {
		if (isEmpty(this)) {
			System.out.println("Queue is empty.....underflow");
		} else {
			int temp = 0;
			priority = priorityQueue[1][0];
			for (int i = 1; i < rear; i++) {
				temp = priorityQueue[1][i];
				if (temp > priority) {
					priority = temp;
					front = i;
				}
			}
			priorityQueue[0][front] = 0;
			priorityQueue[1][front] = 0;
		}
	}

	public static void main(String[] args) {
		PriorityQueue priorityQueue = new PriorityQueue(10);
		priorityQueue.insert(2, 0);
		priorityQueue.insert(4, 2);
		priorityQueue.insert(6, 2);
		System.out.println(priorityQueue.front);
		System.out.println(priorityQueue.rear);
		System.out.println(priorityQueue.size);
		System.out.println(priorityQueue.getHighestPriority());
		priorityQueue.deleteHighestPriority();
		System.out.println(priorityQueue.getHighestPriority());
	}

}