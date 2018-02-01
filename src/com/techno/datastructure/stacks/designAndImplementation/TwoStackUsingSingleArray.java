package com.techno.datastructure.stacks.designAndImplementation;

/**
 *
 * @author Vaishno Upadhyay
 * @since 25:01:2018:05:57
 * @apiNote Implementation of Two stack using single array.
 *
 */
public class TwoStackUsingSingleArray {
	int[] stackArray;
	int stackPointer,stackSize,size,element =0;

	public TwoStackUsingSingleArray(int n) {

		stackArray = new int[n];
		size = n;
		stackSize = size;
		stackPointer = -1;

	}

	void push1(int element){
		if(stackSize < 0){
			System.out.println("there is no real stack exist....");
		}else{
			if(stackPointer < stackSize - 1){
				stackPointer ++;
				stackArray[stackPointer] = element;

			}else{
				System.out.println("stack overflow....");
			}

		}

	}
	void push2(int element){
		if(stackSize < 0){
			System.out.println("there is no real stack exist.....");
		}else{
			if(stackPointer < stackSize -1){
				stackSize--;
				stackArray[stackSize] = element;
			}else{

				System.out.println("stack overflow....");
			}
		}
	}
	int pop1(){

		if(stackSize < 0){
			System.out.println("there no stack exist....");
		}else{
			if(stackPointer != -1){
				 element =  stackArray[stackPointer];
				stackArray[stackPointer] =0;
				 stackPointer--;
				return element;
			}
		}
		if(element == 0 && stackSize>0){
			System.out.println("stack underflow....");
		}
		return element;}
	int pop2(){
		if(stackSize < 0){
			System.out.println("there is no real stack exist...");
		}else{
			if(stackSize <size-1){
				element = stackArray[stackSize];
				stackArray[stackSize] = 0;
				stackSize++;
				return element;
			}

		}
		if(element == 0 && stackSize >0){
			System.out.println("sorry there is no value at the top of the stack...");
		}

		return element;}
	public static void main(String[] args) {
		TwoStackUsingSingleArray ts = new TwoStackUsingSingleArray(10);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		System.out.println("Popped element from" +
				" stack1 is " + ts.pop1());
		ts.push2(40);
		System.out.println("Popped element from" +
				" stack2 is " + ts.pop2());

	}

}
