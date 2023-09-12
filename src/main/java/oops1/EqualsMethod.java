package oops1;

public class EqualsMethod {

	int id;
	String name;

	public EqualsMethod(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {

		return this.id + " " + this.name;
	}

	@Override
	public boolean equals(Object obj) {

		// checking if the two objects
		// pointing to same object
		if (this == obj)
			return true;

		// checking for two condition:
		// 1) object is pointing to null
		// 2) if the objects belong to
		// same class or not

		if (obj == null || this.getClass() != obj.getClass())
			return false;

		// type casting object to the
		// intended class type
		EqualsMethod em = (EqualsMethod) obj;

		// checking if the two
		// objects share all the same values
		return this.id == em.id && this.name.equals(em.name);
	}

	public boolean checkCondn() {

		if (10 > 20) {
			System.out.println(" 10>20 ");
			return true;
		}

		if (10 != 10 || 1 >= 8) {
			System.out.println(" 10==20 || 10>=20 ");
			return false;
		}
		System.out.println("25>23 ");
		return 25 > 23;
	}

	public boolean check() {

		if(false) {
			System.out.println("If True");
			return false;
		}
		
		else {
			System.out.println("else");
			return true;
		}
	}

	public static void main(String[] args) {

		EqualsMethod em = new EqualsMethod(100, "demo");
		EqualsMethod em1 = new EqualsMethod(100, "demo");

		em.checkCondn();
		
		boolean check = em.check();
		System.out.println(" Value"+check);

		// System.out.println(em.equals(em1));
	}
}
