package multiThreading;

public class JoinAndYield {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread() {
			public void run() {
			
				for(int i=0;i<=5;i++) {
					System.out.println(Thread.currentThread().getName()+" : "+i);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
			
				for(int i=0;i<=5;i++) {
					System.out.println(Thread.currentThread().getName()+" : "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		};
		
		
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.start();
		t1.join();
		t2.start();
		
	}
}
