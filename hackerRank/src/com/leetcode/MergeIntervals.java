/**
 * 
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author pkunwer
 *
 */
public class MergeIntervals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(3, 5));
		intervals.add(new Interval(4, 9));
		print(intervals);
		System.out.println("After Merge!");
		print(merge(intervals));
	}

	private static void print(List<Interval> intervals) {
		for (Interval interval : intervals) {
			System.out.print("[" + interval.start + " ," + interval.end + "]");
		}
	}

	private static List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new ArrayList<Interval>();
		if (intervals.isEmpty())
			return result;
		Collections.sort(intervals, new IntervalComp());

		Interval previous = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);
			if (previous.end >= current.start) {
				Interval merged = new Interval(previous.start, Math.max(previous.end, current.end));
				previous = merged;
			} else {
				result.add(previous);
				previous = current;
			}
		}

		result.add(previous);

		return result;

	}

}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

class IntervalComp implements Comparator<Interval> {

	@Override
	public int compare(Interval i1, Interval i2) {
		return i1.start - i2.start;
	}

}
