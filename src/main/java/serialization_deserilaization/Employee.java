package serialization_deserilaization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{

	int id;
	String name;
	String add;
	
	public Employee(int id ,String name,String add) {
		this.id=id;
		this.name=name;
		this.add=add;
		
		System.out.println(" paramenter constructor...");
	}
	
	
	public Employee() {
		System.out.println(" non paramenter constructor...");
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee em =new Employee(123,"John","london");
		
		System.out.println("=============== Serialization start===============");
		
		FileOutputStream fos = new FileOutputStream("printer.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(em);
		
	   
	    
	    System.out.println("=================== Serialization End===============");
	    
	    System.out.println("===============De-Serialization start===============");
	    
	    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("printer.txt"));
	    Object object = ois.readObject();
	    
	    Employee emp=(Employee)object;
	    System.out.println(em.id);
	    System.out.println(em.name);
	    System.out.println(em.add);
	    System.out.println("===============De-Serialization End===============");
	}
}
