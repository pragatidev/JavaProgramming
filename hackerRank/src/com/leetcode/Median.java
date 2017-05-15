/**
 * 
 */
package com.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author pkunwer
 *
 */
public class Median {

	private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	public static void addNumber(int number) {
		if (maxHeap.isEmpty()) {
			maxHeap.add(number);
		} else if (maxHeap.size() == minHeap.size()) {
			if (minHeap.peek() != null && number > minHeap.peek()) {
				maxHeap.offer(minHeap.poll());
				minHeap.offer(number);
			} else {
				maxHeap.offer(number);
			}
		} else {
			if (number < maxHeap.peek()) {
				minHeap.offer(maxHeap.poll());
				maxHeap.offer(number);
			} else {
				minHeap.offer(number);
			}
		}
	}

	public static double getMedian() {
		if (maxHeap.isEmpty()) {
			return 0;
		}
		if (maxHeap.size() == minHeap.size()) {
			return ((double) minHeap.peek() + (double) maxHeap.peek()) / 2.0;
		} else {
			return maxHeap.peek();
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		for (long i = 0; i < n; i++) {
			int num = in.nextInt();
			addNumber(num);
			System.out.println(getMedian());
		}
	}

}
