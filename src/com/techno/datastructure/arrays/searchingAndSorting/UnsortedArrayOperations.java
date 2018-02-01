package com.techno.datastructure.arrays.searchingAndSorting;

/**
 * 
 * @author Vaishno Upadhyay
 * @since 24:01:2018:02:16
 * @apiNote Operations like search,sort,insert and delete in a unsorted Array.
 *
 */
public class UnsortedArrayOperations {
	
	private static void insert(int element , int[] array,int index){
		int length = array.length;
		if(index >= length){
			System.out.println("there is no capacity in the array is left to perform the insert operation");
		}else{
			array[index] = element;
			System.out.println("the element is inserted successfully....");
		}
		
	}
	private static void search(int element , int[] array ,int counter,int capacity){
		
		if(capacity < 0) {
			System.out.println("there is no real array exist");
		}else{
			if(counter < capacity) {
				if(element == array[counter]){
					System.out.println("elemnet is found in the array successfully at a index....."+ counter);
					counter = capacity;
				}else if(counter == capacity -1){
					System.out.println("sorry element is not found in the array");
				}
				counter++;
				search(element , array, counter , capacity);
				
				
			}
		}
	}
	private static void delete(int element , int[] array){
		int arrayLength = array.length;
		int position = findElement(element ,array);
		if (position != -1) {
			for (int i = position; i < arrayLength-1; i++) {
				array[i] = array[i + 1];
			} 
		}else {
			System.out.println("Sorry element is not found to perform delete operation.....");
		}	
		
	}
	
	
	private static int findElement(int element, int[] array) {
		int arrayLength = array.length;
		for(int i=0;i<arrayLength;i++) {
			if(element == array[i]){
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int array[] = new int[]{2,4,5,7,4,11,7,9,1,0};
		int element = 11;
		int index = 9;
		int counter = 0;
		int capacity = array.length;
		UnsortedArrayOperations.insert(element, array, index);
		UnsortedArrayOperations.delete(element, array);
		UnsortedArrayOperations.search(element, array,counter,capacity);
		
	}

}
