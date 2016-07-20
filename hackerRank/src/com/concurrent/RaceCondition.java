/**
 * 
 */
package com.concurrent;

/**
 * @author pkunwer
 *
 */
public class RaceCondition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		UseCounter c = new UseCounter();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}

}

/**
 * This class exposes publicly accessible counter
 * 
 * @author pkunwer
 *
 */
class Counter {
	public static long count = 0;
}

/**
 * 
 * @author pkunwer
 *
 */
class UseCounter implements Runnable {

	public void increment() {
		synchronized (this) {
			Counter.count++;
			System.out.print(Counter.count + " ");
		}
	}

	@Override
	public void run() {
		increment();
		increment();
		increment();
	}

}