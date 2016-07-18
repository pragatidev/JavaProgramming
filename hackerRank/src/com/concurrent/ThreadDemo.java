/**
 * 
 */
package com.concurrent;

/**
 * @author pkunwer
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SimpleThread mt = new SimpleThread("A", 31);
		SimpleThread mt1 = new SimpleThread("B", 25);
		SimpleThread mt2 = new SimpleThread("C", 10);
		mt.start();
		mt1.start();
		mt2.start();
	}

}

class SimpleThread extends Thread {

	private int delay;

	/**
	 * @param delay
	 */
	public SimpleThread(String label, int delay) {
		super("Thread '" + label + "'");
		this.delay = delay;
	}

	public void run() {
		for (int count = 1, row = 1; row < 20; row++, count++) {
			try {
				System.out.format("Line #%d from %s\n", count, getName());
				Thread.currentThread().sleep(delay);
			} catch (InterruptedException ie) {
				// This would be a surprise.
			}
		}
	}

}
