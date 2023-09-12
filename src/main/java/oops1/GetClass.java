package oops1;

public  class GetClass{

	int id;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException, ClassNotFoundException {
		
		GetClass getClass = new GetClass();
		Class  clz = getClass.getClass();
		
		
		
		
		
		System.out.println(getClass);
		
		Object clone = getClass.clone();
		System.out.println(clone);
		
		
	
	}
}
