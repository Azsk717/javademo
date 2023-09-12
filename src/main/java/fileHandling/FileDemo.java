package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		System.out.println(" Running properly..");
		
		// create text file 
		//File f = new File("my.txt");
		//boolean file = f.createNewFile();
		
		// create directory or file
		//File dir = new File("Azahar");
	   // dir.mkdir();
	
	    // create file inside directory 
		//File myfile = new File("Azahar","data.txt");
		//myfile.createNewFile();
		
		// delete file
		//File f = new File("my.txt");
		// f.delete();
		
		
		
		File myfile = new File("Azahar","data.txt");
		
		// writer operation on file 
		FileWriter fw = new FileWriter(myfile);
		
		fw.write("Hello"+"\n");
		fw.write("This is new Msg"+"\n");
		fw.write("New File added..");
		//fw.write("\n");
		//fw.write("\n");
		//fw.write("\n");
		
		fw.flush();
		fw.close();
		
		// read operation from file..
		
		FileReader fr = new FileReader(myfile);
	   
		/* read char by char
		int read = fr.read();
	    while(read!=-1)
		{
			System.out.print((char)read);
			read=fr.read();	
		}
		*/
		
		// by bufferreader BufferedReader br = new BufferedReader(new FileReader(myfile));
		
		BufferedReader br = new BufferedReader(fr);
		
		int count =0;
		
		  String line = br.readLine(); // read first line 

		
		 
		 int length=0;
		  
		 String [] str=line.split(" ");
		 int word =0;
		  
		  while(line!=null) {
			  System.out.println(line);
			  
			  length+= line.length(); 
			  str=line.split(" ");
			  line = br.readLine(); // read next line and re-initialize line variable..
			
			 
			  
			 word += str.length;
			
			  count++;
		  }
		  
		  
		 System.out.println(" line count "+count);
		 System.out.println("chars "+length); 
		
		 System.out.println("word  "+word); 
		
		
	
		
	}
}
