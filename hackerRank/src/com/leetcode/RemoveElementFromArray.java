/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 *Given an array and a value, remove all instances of that value in place and return the new length.
 *The order of elements can be changed
 */
public class RemoveElementFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1,3,4,6,8,7,3,4,2,1};
		int modifiedlength = removeVal(arr, 3);
		System.out.print("Modified length is :"+ modifiedlength );
		
	}
	
	//Time Complexity: O(n), space Complexity:O(1)
	private static int removeVal(int[] arr, int val){
		int index=0;
		for (int i=0; i<arr.length; i++){
			if(arr[i] != val){
				arr[index++]=arr[i];
			}
		}
		
		for (int i=0; i<index; i++)
			System.out.print(arr[i]+ " ");
		return index;
	}

}
