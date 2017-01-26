/**
 * 
 */
package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pkunwer
 * 
 *         Given an Array of Integers, find two numbers such that they add up to
 *         a specific target number input: numbers={2,7,11,15}, target =9
 *         output: index1 =1, index2=7
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numbers[] = { 15, 4, 6, 2, 7, 11, 15, 17 };
		int target = 9;
		int indexes[] = twoSum1(numbers, target);
		System.out.println("Indexes are: " + indexes[0] + "  " + indexes[1]);

	}
	
	//TimeComplexity: O(n) and SpaceComplexity:O(n)
	private static int[] twoSum1(int[] numbers, int target){
		int ret[]=new int[2];
		Map map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			map.put(numbers[i], i);
		}
		for(int i=0; i<numbers.length; i++){
			int num2 = target - numbers[i];
			if(map.containsKey(num2)){
				ret[0]=i+1;
				ret[1]=(int)map.get(num2) + 1;
				return ret;
			}
		}
		
		return ret;
	}

	//without any extra space, in place function
	public static int[] twoSum(int[] numbers, int target) {
		int ret[] = new int[2]; 
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= target) {
				for (int j = i + 1; j < numbers.length; j++) {
					if ((numbers[i] + numbers[j]) == target) {
						ret[0] = i + 1;
						ret[1] = j + 1;
					}
				}
			}

		}
		return ret;

	}
}
