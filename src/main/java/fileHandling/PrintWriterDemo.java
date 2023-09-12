package fileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Print without system.out.println using printwriter
		
		PrintWriter pw = new PrintWriter(System.out);
		
		pw.print("Hello This Is PrintWriter Demo..");
		
		pw.flush();
		
		PrintWriter pw1 = new PrintWriter("printer.txt");
		
		pw1.write(" This printer.txt file");
		pw1.flush();
		
		
		
	}
}
