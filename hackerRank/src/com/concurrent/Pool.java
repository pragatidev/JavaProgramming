/**
 * 
 */
package com.concurrent;

import java.util.concurrent.Semaphore;

/**
 * @author pkunwer
 *
 */
/**
 * Semaphores are often used to restrict the number of threads than can access
 * some (physical or logical) resource. For example, here is a class that uses a
 * semaphore to control access to a pool of items:
 * 
 * <pre> {@code
 */
class Pool {
	private static final int MAX_AVAILABLE = 100;
	private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);

	public Object getItem() throws InterruptedException {
		available.acquire();
		return getNextAvailableItem();
	}

	public void putItem(Object x) {
		if (markAsUnused(x))
			available.release();
	}

	// Not a particularly efficient data structure; just for demo

	protected Object[] items = { "item1", "item2" };

	protected boolean[] used = new boolean[MAX_AVAILABLE];

	protected synchronized Object getNextAvailableItem() {
		for (int i = 0; i < MAX_AVAILABLE; ++i) {
			if (!used[i]) {
				used[i] = true;
				return items[i];
			}
		}
		return null; // not reached
	}

	protected synchronized boolean markAsUnused(Object item) {
		for (int i = 0; i < MAX_AVAILABLE; ++i) {
			if (item == items[i]) {
				if (used[i]) {
					used[i] = false;
					return true;
				} else
					return false;
			}
		}
		return false;
	}
}