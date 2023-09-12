package multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo implements Callable{

	@Override
	public Object call() throws Exception {
		
		System.out.println(" call() Method start");
		
		m1();
		System.out.println("========================================");
		m2();
		System.out.println("========================================");
		m3();
		System.out.println("========================================");
		System.out.println(" call() Method end");
		
		
		
		return "Thread completed...";
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

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		CallableDemo cd = new CallableDemo();
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		
		for(int i=0;i<=100;i++) {
			
			 Future obj = service.submit(cd);
			
			 System.out.println("========================================");
			 System.out.println(obj.get().toString()+" = "+i);
			
			 
			
			 
					 
		}
		service.shutdown();
	}
}
