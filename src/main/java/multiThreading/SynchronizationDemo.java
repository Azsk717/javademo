package multiThreading;

public class SynchronizationDemo implements Runnable {

	public void run() {

		printNum();
		System.out.println("====================================");
		printNo();
		// System.out.println(" Run() Method ");
	}

	public void printNum() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);

			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void printNo() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);

			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		SynchronizationDemo sd = new SynchronizationDemo();

		Thread t = new Thread(sd);
		t.start();

		Thread t1 = new Thread(sd);
		t1.start();

		Thread t2 = new Thread(sd);
		t2.start();
	}
}
