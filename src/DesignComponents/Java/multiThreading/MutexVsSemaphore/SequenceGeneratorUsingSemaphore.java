package Java.multiThreading.MutexVsSemaphore;

/**
 * Mutex - https://www.baeldung.com/java-mutex
 */

import java.util.concurrent.Semaphore;

public class SequenceGeneratorUsingSemaphore extends SequenceGenerator {

    private Semaphore mutex = new Semaphore(1);

    @Override
    public int getNextSequence() {
        try {
            mutex.acquire();
            return super.getNextSequence();
        } catch (InterruptedException e) {
            // exception handling code
        } finally {
            mutex.release();
        }
        return 0;
    }
}
