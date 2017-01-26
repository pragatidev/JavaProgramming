/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 *
 */
public class StockPrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] stocks = { 25, 30, 35, 15, 23, 45 };
		int maxProfit = maxProfit(stocks);
		System.out.print("Max profit is: " + maxProfit);

	}
	
	//Runtime Complexity: O(n), Space Complexity: O(1)
	private static int maxProfit(int[] arr) {

		int minimumIndex = 0;
		int profit = 0;
		int maxProfit = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[minimumIndex])
				minimumIndex = i;

			profit = arr[i] - arr[minimumIndex];
			if (profit > maxProfit) {
				maxProfit = profit;
			}
		}
		return maxProfit;
	}
}
