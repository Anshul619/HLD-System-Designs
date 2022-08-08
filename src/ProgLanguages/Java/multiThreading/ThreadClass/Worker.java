package Java.multiThreading.ThreadClass;

/**
 * Reference - https://www.freecodecamp.org/news/how-to-get-started-with-multithreading-in-java/
 * 
 * @author anshul.agrawal
 *
 */
class Worker extends Thread {

	@Override
	public void run() {
		
		
		for (int i = 0; i <= 5; i++) {
			
			// Print name of the current thread
			System.out.println(Thread.currentThread().getName() + ": " + i);
			
		}
		
	}

}