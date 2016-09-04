/**
 * 
 */
package com.ds.tree;

/**
 * @author pkunwer
 *
 */
public class BinarySearch {

	/**
	 * Returns index of x if it's present in arr[1..r], else return -1
	 * 
	 * @param arr
	 * @param l
	 * @param r
	 * @param x
	 * @return
	 */
	int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = (r + l) / 2;
			if (arr[mid] == x) {
				return mid;
			}

			if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			}

			return binarySearch(arr, mid, r, x);
		}

		return -1;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BinarySearch searchObject = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = searchObject.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
