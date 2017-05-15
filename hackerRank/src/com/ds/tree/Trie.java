/**
 * 
 */
package com.ds.tree;

import java.util.Iterator;
import java.util.Map;

/**
 * @author pkunwer
 *
 */
public class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	// Inserts a word into the trie.
	public void insert(String word) {
		Map<Character, TrieNode> children = root.children;

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);

			TrieNode t;
			if (children.containsKey(c)) {
				t = children.get(c);
			} else {
				t = new TrieNode(c);
				children.put(c, t);
			}
			t.count++;

			children = t.children;

			if (i == word.length() - 1)
				t.isLeaf = true;
		}

	}

	// Returns if the word is in the trie
	public boolean search(String word) {

		TrieNode t = searchNode(word);
		if (t != null && t.isLeaf)
			return true;
		else
			return false;
	}

	// returns if there is any word in the trie that starts with the
	// given prefix.
	public boolean startsWithPrefix(String prefix) {
		if (searchNode(prefix) == null)
			return false;
		else
			return true;
	}
	
	public int count(String word){
		TrieNode t = searchNode(word);
		if (t != null && t.isLeaf)
			return t.count;
		else
			return 0;
	}

	public TrieNode searchNode(String str) {
		Map<Character, TrieNode> children = root.children;
		TrieNode t = null;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (children.containsKey(c)) {
				t = children.get(c);
				children = t.children;
			} else {
				return null;
			}
		}
		return t;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
