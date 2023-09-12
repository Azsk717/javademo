package oops1;

import java.io.IOException;

public class Basics {

	int a;
	
	static int b;
	
	@Override
	public String toString() {
		
		return a+" "+b;
	}
	
	
	
	public Basics() {
		
		
		System.out.print(" a : "+a);
		
		
		System.out.print(" b : "+b);
		
		System.out.println("=============================");
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(new Basics().a=45);
		System.out.println(Basics.b=4);
		
		System.out.println(new Basics().a=55);
		System.out.println(Basics.b=6);
		
		System.out.println(new Basics().a=58);
		System.out.println(Basics.b=9);
		
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Name ");
		
		
		 
	//	System.out.println(Integer.parseInt(br.readLine()));
		
	}
}
