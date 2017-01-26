/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer Given an array of integers, write an in place function to
 *         bring all the non-zero elements to the left of the array keeping the
 *         original order.
 */
public class MovezeroArraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] integerArr = { 1, 0, 0, 3, 5, 2, 0, 0, 7, 9, 11 };
		int[] updatedArr = moveZero(integerArr);
		for (int i=0; i<updatedArr.length; i++){
			System.out.print(updatedArr[i] + " ");
		}
	}

	//Runtime complexity: O(n), space complexity: Inplace, O(1)
	private static int[] moveZero(int[] arr) {
		int index = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0)
				arr[index--] = arr[i];
		}

		while (index >= 0)
			arr[index--] = 0;
		return arr;
	}

}
