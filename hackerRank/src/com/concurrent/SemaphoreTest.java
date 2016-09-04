/**
 * 
 */
package com.concurrent;

import java.util.concurrent.Semaphore;

/**
 * @author pkunwer
 *
 */
public class SemaphoreTest {

	private int value = 0;

	private final Semaphore mutex = new Semaphore(1);

	public int getNextValue() throws InterruptedException {
		try {
			mutex.acquire();
			return value++;
		} finally {
			mutex.release();
		}
	}
}
