/**
 * 
 */
package com.leetcode;

import java.util.Scanner;

/**
 * @author pkunwer
 *
 */
public class TrieNoPrefix {

	static class TrieNode {
		boolean isLeaf;
		TrieNode[] children = new TrieNode[26];

		void add(String s) {
			TrieNode current = this;
			for (int i = 0; i < s.length(); i++) {
				int index = s.charAt(i) - 'a';
				if (current.children[index] == null) {
					current.children[index] = new TrieNode();
				}
				current = current.children[index];
			}
			current.isLeaf = true;
		}

		boolean isSearch(String str) {
			TrieNode current = this;
			for (int i = 0; i < str.length(); i++) {
				int index = str.charAt(i);
				current = current.children[index];
				if (current == null)
					return false;
				else if (current.isLeaf)
					return true;
			}
			return true;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TrieNode root = new TrieNode();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		String s = null;
		for (int i = 0; i < num; i++) {
			String str = sc.next();
			if (!root.isSearch(str)) {
				root.add(str);
			} else {
				flag = true;
				s = str;
				break;
			}
		}
		if (!flag)
			System.out.println("GOOD SET");
		else {
			System.out.print("BAD SET");
			System.out.println(s);
		}

	}

}
