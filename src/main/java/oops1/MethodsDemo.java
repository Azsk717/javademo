package oops1;

public class MethodsDemo {

	Student getstd(int sid ) {
		
		Student s=new Student();
		/*
		 * s.id=100; s.name="Ajay"; s.add="Mumbai";
		 * 
		 * Student s1 = new Student(); s1.id=200; s1.name="Vjay"; s1.add="Pune";
		 */
		
		if(sid==100) {
			s=new Student();
			s.id=100;
			s.name="Ajay";
			s.add="Mumbai";
		}
		
		else if(sid==200) {
			s=new Student();
			s.id=200;
			s.name="Vjay";
			s.add="Pune";
		}
		
		return s;
	}
	
	
	void showStudents(Student[] std) {
		
		for(Student s : std) {
			System.out.println(s.id +"  "+s.name+"  "+s.add);
		}
	}
	
	public static void main(String[] args) {
		
		MethodsDemo m = new MethodsDemo();
		Student getstd = m.getstd(200);
		System.out.println(getstd.name + " "+ getstd.add);
		
		Student s=new Student();
		s.id=200;
		s.name="Vjay";
		s.add="Pune";
		
		Student s1=new Student();
		s1.id=100;
		s1.name="Ajay";
		s1.add="Mumbai";
		
		Student[] arr= {s,s1};
		m.showStudents(arr);
	}
}

class Student{
	
	int id ;
	String name;
	String add;
	
	
}