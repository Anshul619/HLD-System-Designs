package Java.multiThreading.Others;

/**
 * https://www.baeldung.com/java-concurrency-interview-questions
 * 
 */
import java.util.*;

public class BlockingQueue {
	private List<Integer> queue = new LinkedList<Integer>();

    private int limit = 10;

    /**
     * The synchronized keyword before a block means that any thread entering this block has to acquire the monitor (the object in brackets). 
     * If the monitor is already acquired by another thread, the former thread will enter the BLOCKED state and wait until the monitor is released.
     * 
     * @param item
     */
    public synchronized void put(Integer item) {
        while (queue.size() == limit) {
            try {
            	// Temporarily release the monitor and give other threads a chance to acquire the monitor
                wait();
            } catch (InterruptedException e) {}
        }
        if (queue.isEmpty()) {
        	
        	// When another thread that acquired the monitor fulfills the condition, it would release the monitor, by calling notifyAll()
            notifyAll();
        }
        queue.add(item);
    }

    public synchronized Integer take() throws InterruptedException {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        if (queue.size() == limit) {
            notifyAll();
        }
        return queue.remove(0);
    }
}
