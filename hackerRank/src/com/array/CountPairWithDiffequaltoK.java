/**
 * 
 */
package com.array;

/**
 * @author pkunwer
 *
 */
public class CountPairWithDiffequaltoK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6, 9, 13, 15 };
		int diff = 2;
		System.out.println(countPairsWithDiffK(arr, diff));

	}

	static int countPairsWithDiffK(int arr[], int diff) {
		int size = arr.length;
		int i = 0, k = 0, pairs = 0;

		while (k < size) {
			if (arr[k] - arr[i] == diff) {
				pairs++;
				i++;
				k++;
			} else if (arr[k] - arr[i] > diff)
				i++;
			else
				k++;
		}
		return pairs;
	}

}
