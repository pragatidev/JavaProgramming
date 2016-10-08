/**
 * 
 */
package com.ds.sorting;

/**
 * @author pragati
 *
 */
public class SelectionSort {

	void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SelectionSort so = new SelectionSort();
		int arr[] = {64,32,43,56,89,91,60};
		so.selectionSort(arr);
		so.printArray(arr);

	}

}
