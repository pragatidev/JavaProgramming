/**
 * 
 */
package com.ds.stack;

import java.beans.VetoableChangeListener;
import java.util.Vector;

/**
 * @author pkunwer
 * @param <E>
 *
 */
public class MultiThreadStack<E> extends Vector<E> {

	public MultiThreadStack() {

	}
	
	public E push (E item){
		
		return item;
	}
	
//	public pop (){
//		
//	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1300823611366804881L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
