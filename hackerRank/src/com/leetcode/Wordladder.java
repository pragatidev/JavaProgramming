/**
 * 
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * @author pkunwer Given two words start and end and a dictionary, find the
 *         length of shortest transformation sequence from start to end, such
 *         that: 1. Only one letter can be changed at a time 2. Each
 *         intermediate word must exist in the dictionary
 * 
 */
public class Wordladder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set set = new HashSet<String>(Arrays.asList(new String[] { "hot", "dot", "dog", "lot", "log" }));
	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		Set<String> wordSet = new HashSet<>();
		for (String s : wordList) {
			wordSet.add(s);
		}
		Queue<String> word = new LinkedList<String>();
		Queue<Integer> count = new LinkedList<>();

		if (wordSet.size() == 0 || !wordSet.contains(endWord))
			return 0;
		word.offer(beginWord);
		count.offer(1);

		while (!word.isEmpty()) {
			String curWord = word.poll();
			Integer currentCount = count.poll();

			if (curWord.equals(endWord)) {
				return currentCount;
			}

			for (int i = 0; i < curWord.length(); i++) {
				char[] charArr = curWord.toCharArray();
				for (char ch = 'a'; ch <= 'z'; ch++) {
					charArr[i] = ch;

					String newWord = new String(charArr);
					if (wordSet.contains(newWord)) {
						word.offer(newWord);
						count.offer(currentCount + 1);
						wordSet.remove(newWord);

					}

				}
			}
		}

		return 0;
	}

}
