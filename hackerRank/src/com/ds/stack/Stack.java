/**
 * 
 */
package com.ds.stack;

/**
 * @author pkunwer
 * 
 * 
 *         A Stack is a LIFO sequence. Addition and Removal takes place only at
 *         one end, called top. Supported Operations: 1. push(x): add an item on
 *         the top. 2. pop(): remove an item at the top. 3. peek: return the
 *         item at the top (without removing it). 4. size: return the number of
 *         items at the stack. 5. isEmpty: return whether the stack has no
 *         items. Examples: Stack of Plates, Trains, Vending Machines,
 *         Expression Evaluation, Matching Delimiters, Navigating a maze, Map
 *         Coloring,
 *
 */
public interface Stack {

	/**
	 * Adds the given item at the top of the stack
	 * 
	 * @param item
	 */
	void push(Object item);

	/**
	 * Removes the top item from the stack and returns it.
	 * 
	 * @exception java.util.NoSuchElementException
	 *                if stack is empty.
	 * @return
	 */
	Object pop();

	/**
	 * Returns the top items from the stack without popping it.
	 * 
	 * @return
	 */
	Object peek();

	/**
	 * Returns the number of items currently in the stack.
	 * 
	 * @return
	 */
	int size();

	/**
	 * Returns whether the stack is empty or not.
	 * 
	 * @return
	 */
	boolean isEmpty();

}
