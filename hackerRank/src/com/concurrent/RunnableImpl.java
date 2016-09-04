/**
 * 
 */
package com.concurrent;

/**
 * @author pkunwer
 *
 */
public class RunnableImpl implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("In run(), thread nmae is: " + Thread.currentThread().getName());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread myThread = new Thread(new RunnableImpl());
		myThread.start();
		System.out.println("In main(), thread name is: " + Thread.currentThread().getName());

	}

}
