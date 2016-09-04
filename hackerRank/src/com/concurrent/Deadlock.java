/**
 * 
 */
package com.concurrent;

/**
 * @author pkunwer
 *
 */
public class Deadlock {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		CounterT c = new CounterT();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		System.out.println("Waiting for Threads to complete Execution: ");
		t1.join();
		t2.join();
		System.out.println("Done");
	}

}

// Balls class has a globally accessible data member to hold the number of balls
// thrown
class Balls {
	public static long balls = 0;
}

// Runs class has a globally accessible data member to hold the number of runs
// scored
class Runs {
	public static long runs = 0;
}

class CounterT implements Runnable {

	// we need to acquire a lock before processing them
	public void IncrementBallAfterRun() {
		// since we're updating runs variable first, first lock the Runs.class
		synchronized (Runs.class) {
			// lock on Balls.class before updating balls variable
			synchronized (Balls.class) {
				Runs.runs++;
				Balls.balls++;
			}
		}
	}

	public void IncrementRunAfterBall() {
		// since we're updating balls variable first; so first lock Balls.class
		synchronized (Balls.class) {
			// acquire lock on Runs.class before updating runs variable
			synchronized (Runs.class) {
				Balls.balls++;
				Runs.runs++;
			}
		}
	}

	@Override
	public void run() {

		IncrementBallAfterRun();
		IncrementRunAfterBall();
	}

}
