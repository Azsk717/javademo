package exceptions;

import java.util.Arrays;

public  class DemoException {

	private static char[] ch[];

	public static void main(String[] args) {
		
		String s = null;
		s="Azahar";
		
		try {
			
			int a=s.length();
			System.out.println(a);
		    char[] ch= s.toCharArray();
		    
		    System.out.println(Arrays.toString(ch));
		}
		/*
		catch (Exception e) {
			System.out.println(" Catch block ..");
		}
		*/
		finally {
			System.out.println(" finally block...");
		}
		
	}
}
