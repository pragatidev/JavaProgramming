/**
 * 
 */
package com.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author pkunwer
 *
 */
public class AtomicVariableTest {

	static class Incrementer extends Thread {
		public void run() {
			CounterTest.integer++;
			CounterTest.atomicInteger.incrementAndGet();
		}
	}

	static class Decrementer extends Thread {
		public void run() {
			CounterTest.integer--;
			CounterTest.atomicInteger.decrementAndGet();
		}
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		Thread incrementerThread[] = new Incrementer[1000];
		Thread decrementerThread[] = new Decrementer[1000];

		for (int i = 0; i < 1000; i++) {
			incrementerThread[i] = new Incrementer();
			decrementerThread[i] = new Decrementer();
			incrementerThread[i].start();
			decrementerThread[i].start();
		}
		for (int i = 0; i < 1000; i++) {
			incrementerThread[i].join();
			decrementerThread[i].join();
		}

		System.out.printf("Integer value = %d AtomicInteger value = %d ", CounterTest.integer,
				CounterTest.atomicInteger.get());
	}

}

class CounterTest {
	public static Integer integer = new Integer(0);
	public static AtomicInteger atomicInteger = new AtomicInteger(0);
}
