/**
 * 
 */
package com.concurrent;

import java.util.concurrent.Executor;

/**
 * @author pkunwer
 *
 */
public class ExecutorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Runnable runnable = new Task();
		System.out.println("Calling Task.run() by directly creating a Thread");
		Thread thread = new Thread(runnable);
		thread.start();

		RepeatedExecutor executor = new RepeatedExecutor();
		executor.execute(runnable, 3);
	}

}

class Task implements Runnable {

	@Override
	public void run() {

		System.out.println("Calling Task.run() ");
	}

}

class RepeatedExecutor implements Executor {

	@Override
	public void execute(Runnable runnable) {

		new Thread(runnable).start();
	}

	public void execute(Runnable runnable, int times) {
		System.out.printf("Calling Task.run() %d times thro' Executor.execute() %n", times);
		for (int i = 0; i < times; i++) {
			execute(runnable);
		}
	}

}