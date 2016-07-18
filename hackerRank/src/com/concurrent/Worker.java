/**
 * 
 */
package com.concurrent;

/**
 * @author pkunwer
 *
 */
public class Worker implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		System.out.println(
				"This is currently running on a separate thread, " + "the id is: " + Thread.currentThread().getId());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(
				"This is currently running on the main thread, " + "the is id: " + Thread.currentThread().getId());
		Worker worker = new Worker();
		Thread thread = new Thread(worker);
		thread.start();
	}

}
