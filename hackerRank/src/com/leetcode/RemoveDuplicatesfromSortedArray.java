/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 * Description: Given a sorted array, remove the duplicates in place such that each element 
 * appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example, Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 *
 */
public class RemoveDuplicatesfromSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3,3,3,5,5,5,6,6};
		int newLength = removeDuplicates(arr);	
		System.out.println("New length is: "+ newLength);
	}
	
	private static int removeDuplicates(int[] arr){
		int index = 0;
		for (int i=1; i<arr.length; i++){
			if(arr[index] != arr[i]){
				arr[++index]=arr[i];
			}
		}		
		return index+1;
	}

}
