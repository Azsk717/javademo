package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileQue {

	public static void main(String[] args) throws IOException {
		
		
		
		
		File file1 = new File("Azahar","f1.txt");
		
		
		File file2 = new File("Azahar","f2.txt");
		
		File file3 = new File("Azahar","f3.txt");
		
		FileReader fr1 = new FileReader(file1);
		
		FileReader fr2 = new FileReader(file2);
		
		FileWriter fw = new FileWriter(file3);
		
	
		BufferedReader br1 = new BufferedReader(fr1);
		
		BufferedReader br2 = new BufferedReader(fr2);
		
		String readLine = br1.readLine();
		String readLine1 = br2.readLine();
		
		while(readLine!=null) {
			
			System.out.println(readLine);
		
			fw.write(readLine+"\n");
			readLine = br1.readLine();
			
		}
		
          while(readLine1!=null) {
			
			System.out.println(readLine1);
		
			fw.write(readLine1);
			readLine1 = br1.readLine();
			
		}
		
          fw.flush();
	}
}
