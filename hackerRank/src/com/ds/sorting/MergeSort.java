/**
 * 
 */
package com.ds.sorting;

/**
 * @author pragati
 * 
 *         Merge Sort is based on divide and conquer paradigm. It involves
 *         following three steps, Divide the array into two (or more) subarrays.
 *         (divide) sort each sub array (conquer) Merge them into one (in smart
 *         way!)
 *
 */
public class MergeSort {

	void merge(int arr[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArr[i] = arr[l + i];
		}

		for (int i = 0; i < n2; i++) {
			rightArr[i] = arr[m + i + 1];
		}

		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;

			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			// sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// now merge the sorted halves

			merge(arr, l, m, r);
		}

	}

	/**
	 * A utility function to print array of size n
	 */
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = { 3, 16, 15, 18, 25, 9 };
		System.out.println("Given Array is: ");
		printArray(arr);
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array is: ");
		printArray(arr);
	}

}
