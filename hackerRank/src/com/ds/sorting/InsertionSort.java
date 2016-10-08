/**
 * 
 */
package com.ds.sorting;

/**
 * @author pragati
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

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
