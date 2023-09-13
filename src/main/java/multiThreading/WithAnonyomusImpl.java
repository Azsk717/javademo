package multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WithAnonyomusImpl {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		Thread t = new Thread() {
			
			@Override
			public void run() {
				
				System.out.println(" Method run() thread annonyoumus logic -1 ");
			}
		};
		
		t.start();
		
		
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(" Method run() Runnable annonyoumus logic - 2  ");
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		
		Callable c = new Callable() {
			@Override
			public Object call() throws Exception {
				
				String s = " Method call() Callable annonyoumus logic - 3 ";
				
				return s;
			}
		};
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future s = service.submit(c);
		System.out.println(s.get().toString());
		
	}
}
