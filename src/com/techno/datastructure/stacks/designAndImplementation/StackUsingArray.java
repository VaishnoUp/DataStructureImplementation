package com.techno.datastructure.stacks.designAndImplementation;

/**
 * @author Vaishno Upadhyay
 * @apiNote Stack Implementation using Array.
 * @since 25:01:2018:03:47
 */

public class StackUsingArray {
    int stackPointer, stackSize;
    int[] stackArray;

    public StackUsingArray(int size) {

        stackArray = new int[size];
        stackSize = size;
        stackPointer = stackSize;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(10);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

    void push(int element) {
        if (stackSize < 0) {
            System.out.println("Sorry there is no real Stack exist...");
        } else {
            if (stackPointer <= stackSize) {
                stackPointer--;
                stackArray[stackPointer] = element;
            } else {
                System.out.println("stack is overflow");
            }
        }
    }

    int pop() {
        int element = 0;
        if (stackSize < 0) {
            System.out.println("sorry there is no element to pop");
        } else {
            if (stackPointer < stackSize) {
                element = stackArray[stackPointer];
                stackArray[stackPointer] = 0;
                stackPointer++;
            }
        }
        if (element == 0 && stackSize > 0) {
            System.out.println("sorry there is no value at the top of the stack");
        }

        return element;

    }

}
