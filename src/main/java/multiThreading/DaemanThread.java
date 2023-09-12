package multiThreading;

public class DaemanThread implements Runnable {

	@Override
	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println(" Daeman Thread Running..");
		} else {
			System.out.println(" Normal Thread Running..");
		}

	}

	public static void main(String[] args) {

		DaemanThread d = new DaemanThread();

		Thread t = new Thread(d);
		t.setDaemon(true);
		t.start();

	}

}
