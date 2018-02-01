package com.techno.datastructure.arrays.searchingAndSorting;

/**
 * 
 * @author Vaishno Upadhyay
 * @since 25:01:2018:01:01
 * @apiNote Operations like search,sort,insert and delete in a sorted Array.
 *
 */

public class SortedArrayOperations {

	private static void search(int element, int[] array) {
		int arrLength = array.length;
		boolean found = false;
		for (int i = 0; i < arrLength; i++) {
			if(element == array[i]){
				found = true;
				System.out.println("element found at index   "+ i);
				break;
			}
		}
		if(!found){
			System.out.println("element not found in the array");
		}

	}

	private static void insert(int element, int[] array, int n) {
		int arrLength = array.length;
		int i;
		 for (i=n-1; (i >= 0 && array[i] > element); i--)
		 {
			 array[i+1] = array[i];
		 }
	      
		 array[i+1] = element;
		 for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		 
		

	}

	private static void delete(int element, int[] array) {
		int arrLength = array.length;
		int pos = findElementPosition(element, array);
		if (pos != -1) {
			for (int i = pos; i < arrLength - 1; i++) {
				array[i] = array[i + 1];
			} 
		}else {
			System.out.println("Sorry element is not found in the array to perform delete operation..");
		}
		

	}

	private static int findElementPosition(int element, int[] array) {
		int arrLength = array.length;
		for (int i = 0; i < arrLength; i++) {
			if(element == array[i]){
			return i;	
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9,0 };
		int element = 6;
		int key = 10;
		int n = 9;
		//SortedArrayOperations.search(element, array);
		//SortedArrayOperations.delete(element, array);
		SortedArrayOperations.insert(element, array,n);
	}

}
