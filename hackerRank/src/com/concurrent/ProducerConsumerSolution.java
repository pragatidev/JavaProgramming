/**
 * 
 */
package com.concurrent;

/**
 * @author pkunwer
 *
 */
public class ProducerConsumerSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class intBuffer {
	private int index;
	private int[] buffer = new int[8];
	public void add (int num){
		while (true){
			if (index < buffer.length){
				buffer[index++] = num;
				return;
			}
		}
	}
}
