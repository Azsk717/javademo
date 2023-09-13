package multiThreading;

public class Customer {

	int balance = 10000;

	public synchronized void withDraw(int amount) {

		System.out.println(" going for withdarw amount..");
		if (balance < amount) {
			System.out.println(" Balance is '" + balance + "' less than enter amount " + amount);

			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

		balance -= amount;

		System.out.println(" Withdraw completed  available balance is : " + balance);
	}

	public synchronized void deposite(int amount) {
		System.out.println(" go deposite amount : " + amount);
		balance += amount;
		notify();
		System.out.println("deposite completed available balance is : " + balance);
	}

	public static void main(String[] args) {

		final Customer c = new Customer();

		new Thread() {
			public void run() {

				c.withDraw(17000);
			};
		}.start();

		new Thread() {
			public void run() {

				c.deposite(20000);
			};
		}.start();

	}
}
