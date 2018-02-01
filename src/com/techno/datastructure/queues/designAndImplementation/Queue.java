package com.techno.datastructure.queues.designAndImplementation;

/**
 * 
 * @author Vaishno Upadhyay
 * @since 29:01:2018:12:24
 * @apiNote Simple Queue implementation.
 *
 */

public class Queue {
	int size, front, rear;
	int[] queueArray;
	
	
	public Queue(int size){
		queueArray = new int[size];
		front = rear = 0;
		this.size = size;
	}
	
	public boolean isFull(Queue queue){
		return (queue.rear == queue.size-1);
	}
	
	public boolean isEmpty(Queue queue){
		return (queue.rear == -1);
		
	} 
	
	public void enQueue(int data){
		if(isFull(this)){
			System.out.println("Queue is full now...Overflow");
		}else{
			
			queueArray[rear] = data;
			rear = rear + 1 ;
			
		}
		
	}
	
	public int deQueue(){
		if(isEmpty(this)){
			System.out.println("Queue is empty.....underflow");
		}else {
			
			int data = queueArray[front];
			queueArray[front] = 0;
			front = front + 1;
			return data;
		}
		return -1;
		
	}
	
	public int peek(){
		return queueArray[front];
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue(10);
		queue.enQueue(2);
		queue.enQueue(4);
		queue.enQueue(6);
		queue.enQueue(8);
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.size);
		System.out.println(queue.peek());
		System.out.println(queue.deQueue());
		System.out.println(queue.peek());
		
	}
	

}
