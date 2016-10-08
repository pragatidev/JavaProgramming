/**
 * 
 */
package com.ds.sorting;

/**
 * @author pragati
 *
 */
public class BubbleSort {
	
	void bubbleSort(int[] arr){
		int size = arr.length;
		for (int i = size; i>0; i-- ){
			for (int j=1; j<i; j++){
				if (arr[j-1] > arr[j]){
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}				
				
			}
		}
	}
	
	void printArray(int[] arr){
		for (int i=0 ; i< arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = {1,5,6,7,9,2,6};
		BubbleSort ob = new BubbleSort();
		ob.bubbleSort(arr);
		System.out.println("Print Sorted Array!");
		ob.printArray(arr);
	}

}
