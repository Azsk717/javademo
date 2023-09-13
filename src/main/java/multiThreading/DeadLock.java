package multiThreading;

public class DeadLock {

	public static void main(String[] args) {

		String s1 = "hii";
		String s2 = "hello";

		Thread t1 = new Thread() {
			public void run() {

				synchronized (s1) {

					System.out.println("Thread-1 locked resource-1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					synchronized (s2) {
						System.out.println("Thread-1 waiting resource-2");
					}
					
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {

				synchronized (s2) {

					System.out.println("Thread-2 locked resource-2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					synchronized (s1) {
						System.out.println("Thread-2 waiting resource-1");
					}
					
				}
			}
		};

		t1.start();
		t2.start();

	}
}

/*
 * synchronized (s1) { System.out.println("Thread-1 lock resource-1"); try {
 * Thread.sleep(1000); } catch (Exception e) { e.printStackTrace(); } }
 * 
 * synchronized (s2) { System.out.println("Thread-1 waiting resource-2"); }
 */

/*
 * synchronized (s2) { System.out.println("Thread-2 lock resource-2"); try {
 * Thread.sleep(1000); } catch (Exception e) { e.printStackTrace(); } }
 * 
 * synchronized (s1) { System.out.println("Thread-2 waiting resource-1"); }
 */
