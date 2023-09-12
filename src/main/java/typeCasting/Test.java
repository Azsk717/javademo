package typeCasting;

public class Test {

	public static void main(String[] args) {
		
		// Child Object 
		Child ch = new Child();
		
		Parent p = ch;// Widening
		
		
		Child ch1 = (Child)p; // Narrowing 
	}
}
