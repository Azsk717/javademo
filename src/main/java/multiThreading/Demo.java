package multiThreading;

//public class Demo extends Thread
public class Demo implements Runnable{

	public void run() {

		 System.out.println(" run() start.. ");
		 
		 m1();
		 
		 try {
			 m2();
			 Thread.sleep(5000);// blocked state
			 m3();
		} catch (Exception e) {
			
		}
		 
	
		 
		
	     System.out.println(" run() end.. ");
	    
		
	}

	void m1() {
       System.out.println(" m1() start.. ");
       System.out.println(" m1() end.. ");
	}

	void m2() {

		 System.out.println(" m2() start.. ");
	     System.out.println(" m2() end.. ");
	}

	void m3() {

		 System.out.println(" m3() start.. ");
	     System.out.println(" m3() end.. ");
	}

	public static void main(String[] args) {

		System.out.println(" Main started...");

		Demo d = new Demo();
		
		Thread t = new Thread(d);
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t.start();
		t1.start();
		t2.start();
		
		
		System.out.println(" Main started...");

	}
}
