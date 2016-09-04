/**
 * 
 */
package com.ds.tree;

/**
 * @author pkunwer
 *
 */
public class BinarySearchiter {

	int binarySearch(int arr[], int x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (arr[m] == x)
				return m;

			if (arr[m] > x) {
				r = m - 1;
			} else
				l = m + 1;

		}
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BinarySearchiter ob = new BinarySearchiter();
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
