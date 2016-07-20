/**
 * 
 */
package com.concurrent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author pkunwer
 *
 */
public class Worker implements Runnable {

	private boolean running = false;

	public Worker() {
		Thread thread = new Thread(this);
		thread.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		this.running = true;
		System.out.println(
				"This is currently running on a separate thread, " + "the id is: " + Thread.currentThread().getId());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		this.running = false;

	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		List<Worker> workers = new ArrayList<Worker>();

		System.out.println(
				"This is currently running on the main thread, " + "the is id: " + Thread.currentThread().getId());
		Date start = new Date();
		for (int i = 0; i < 5; i++) {
			workers.add(new Worker());
		}

		System.out.println(workers);

		for (Worker worker : workers) {
			while (worker.running)
				Thread.sleep(100);
		}

		Date end = new Date();
		long difference = end.getTime() - start.getTime();
		System.out.println("This whole process took: " + difference / 1000 + " seconds.");
	}

}
