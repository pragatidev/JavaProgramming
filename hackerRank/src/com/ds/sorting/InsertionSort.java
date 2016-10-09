/**
 * 
 */
package com.ds.sorting;

/**
 * @author pragati
 * 
 * Advantage of InsertionSort over Selection sort and Bubble sort is that it gives near linear time 
 * performance when list is sorted to an extent
 *
 */
public class InsertionSort {

	void insertionSot(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > index) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = index;
		}
	}
	
	void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {23,45,8,91,63,20};
		InsertionSort is = new InsertionSort();
		is.insertionSot(arr);
		System.out.println("Sorted Array is: ");
		is.printArray(arr);

	}

}
