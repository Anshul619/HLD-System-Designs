package Java.multiThreading.ThreadClass;

/**
 * Reference - https://www.freecodecamp.org/news/how-to-get-started-with-multithreading-in-java/
 * 
 * @author anshul.agrawal
 *
 */
public class ThreadClassDemo {

	public static void main(String[] args) {
		Thread t1 = new Worker();
		Thread t2 = new Worker();
		Thread t3 = new Worker();
		t1.start();
		t2.start();
		t3.start();

	}
}
