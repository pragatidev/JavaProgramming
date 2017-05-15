/**
 * 
 */
package com.leetcode;

import java.util.Scanner;

/**
 * @author pkunwer
 *
 */
public class TrieContact {

	static class TrieNode {
		// No. of contacts possible after reaching this node in the trie
		int noOfContacts = 0;
		// Next characters in the 26-ary trie
		TrieNode[] children = new TrieNode[26];

		void add(String s) {
			TrieNode current = this;
			for (int i = 0; i < s.length(); i++) {
				int index = s.charAt(i) - 'a';
				if (current.children[index] == null) {
					current.children[index] = new TrieNode();
				}
				current.noOfContacts++;
				current = current.children[index];
			}
			current.noOfContacts++;
		}

		int search(String val) {
			TrieNode current = this;
			for (int i = 0; i < val.length(); i++) {
				int index = val.charAt(i) - 'a';
				current = current.children[index];
				if (current == null)
					break;
			}
			return (current == null) ? 0 : current.noOfContacts;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TrieNode root = new TrieNode();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String op = in.next();
			String contact = in.next();

			if ("add".equals(op)) {
				root.add(contact);
			} else {
				System.out.println(root.search(contact));
			}
		}
		in.close();
	}

}
