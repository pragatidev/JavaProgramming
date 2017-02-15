/**
 * 
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pkunwer Given a set of non-overlapping & sorted intervals, insert a
 *         new interval into the intervals (merge if necessary). Example 1
 *         :Given i n t e r v a l s [ 1 , 3 ] , [ 6 , 9 ] , i n s e r t and
 *         merge [ 2 , 5 ] in as [ 1 , 5 ] , [ 6 , 9 ] . Example 2 :Given [ 1 ,
 *         2 ] , [ 3 , 5 ] , [ 6 , 7 ] , [ 8 , 1 0 ] , [ 1 2 , 1 6 ] , i n s e r
 *         t and merge [ 4 , 9 ] in as [ 1 , 2 ] , [ 3 , 1 0 ] , [ 1 2 , 1 6 ] .
 *         This is because the new interval [ 4 , 9 ] over laps with [ 3 , 5 ] ,
 *         [ 6 , 7 ] , [ 8 , 1 0 ].
 *
 */
public class InsertInterval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(3, 5));
		intervals.add(new Interval(4, 9));

		print(intervals);
		System.out.println("After Insert!");
		print(insertIntervals(intervals, new Interval(8, 10)));
	}

	private static void print(List<Interval> intervals) {
		for (Interval interval : intervals) {
			System.out.print("[" + interval.start + " ," + interval.end + "]");
		}
	}

	public static List<Interval> insertIntervals(List<Interval> intervals, Interval newInterval) {
		List<Interval> finalIntervals = new ArrayList<>();

		for (Interval interval : intervals) {
			if (interval.end < newInterval.start) {
				finalIntervals.add(interval);
			} else if (interval.start > newInterval.end) {
				finalIntervals.add(newInterval);
				newInterval = interval;
			} else if (interval.end >= newInterval.start || interval.start <= newInterval.end) {
				newInterval = new Interval(Math.min(interval.start, newInterval.start),
						Math.max(interval.end, newInterval.end));
			}
		}

		finalIntervals.add(newInterval);
		return finalIntervals;
	}

}
