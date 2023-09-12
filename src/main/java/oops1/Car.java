package oops1;

public class Car {

	void drive() {
		 new Engine()
		 .start();
		System.out.println("Let go to drive..");
		
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
	}
}
