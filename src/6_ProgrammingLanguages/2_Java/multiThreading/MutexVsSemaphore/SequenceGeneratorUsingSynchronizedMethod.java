package Java.multiThreading.MutexVsSemaphore;

/**
 * https://www.baeldung.com/java-mutex
 */
public class SequenceGeneratorUsingSynchronizedMethod extends SequenceGenerator {

    @Override
    public synchronized int getNextSequence() {
        return super.getNextSequence();
    }

}
