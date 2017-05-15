/**
 * 
 */
package com.ds.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pkunwer
 *
 */
public class TrieNode {
	char c;
	Integer count;
	Map<Character, TrieNode> children = new HashMap<>();
	boolean isLeaf;

	public TrieNode() {
	};

	public TrieNode(char c) {
		this.c = c;
	}

}
