/**
 * 
 */
package com.ds.stack;

import java.util.LinkedList;

/**
 * @author pkunwer
 * 
 * 
 *         A stack class implemented as wrapper around a java.util.LinkedList.
 *         All stack methods simply delegate to Linkedlist methods.
 * 
 *         The list interface is being narrowed to that of stack.
 *
 */
public class SimpleStack implements Stack {

	private LinkedList<Object> list = new LinkedList<Object>();

	@Override
	public void push(Object item) {

		list.addFirst(item);
	}

	@Override
	public Object pop() {
		return list.removeFirst();
	}

	@Override
	public Object peek() {
		return list.getFirst();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

}
