package DesignComponents.Java.multiThreading.RunnableInterface;

/**
 * Implementing the runnable interface is a better option than extending the thread class since we can extend only one class, but we can implement multiple interfaces in Java.
 * - https://www.interviewbit.com/java-interview-questions/
 * - https://www.freecodecamp.org/news/how-to-get-started-with-multithreading-in-java/
 *
 * @author anshul.agrawal
 *
 */
public class RunnableInterfaceDemo {
	
	public static void main(String[] args) {
		
		Runnable r = new RunnableWorker();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.start(); // Create call stack for thread execution. Once the call stack is created, JVM calls the run() method for executing the thread in that call stack.
		t2.start();
		t3.start();

	}

}
