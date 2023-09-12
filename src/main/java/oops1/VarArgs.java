package oops1;

import java.util.Arrays;

public class VarArgs {

	public void m1(int... a) {
		int sum=0;
		for(int c : a)
		{
			sum+=c;
			System.out.println();
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		new VarArgs().m1(-8,10);
	}
}
