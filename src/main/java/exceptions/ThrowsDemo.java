package exceptions;

import java.io.FileReader;

public class ThrowsDemo {

	void m1() throws Exception {
		System.out.println(" m1() Method..");
		FileReader fr = new FileReader("abc.txt");
		Class.forName("");
	}

	public String m2(int id) throws Exception {

		String name;

		if (id == 100) {
			name = "Raja";
		} else if (id == 200) {
			name = "Rani";
		} else {
			throw new IdNotFoundException(" Id '" + id + "' Not Found...");
		}

		return name;
	}

	public void m4(int a, int b) {

		System.out.println(" m4 method started..");
		
		int c=a/b;
		
		System.out.println(" m4 method ended.."+c);
	}

	public void m3(int a, int b) {

		System.out.println(" m3 method started..");
		
		m4(a,b);
		
		System.out.println(" m3 method ended..");
	}

	public static void main(String[] args) throws Exception {

		ThrowsDemo demo = new ThrowsDemo();
		//String name = demo.m2(300);
		//System.out.println(name);
		// demo.m1();
		
		System.out.println(" main() method started..");
		try {
			
			demo.m3(12,0);
			
		} catch (Exception e) {
			System.err.println(" Exception "+e);
		}
		
		System.out.println(" main() method ended..");
	}
}
