package practise;

class Account {
	private double bal;
	private int acc;
	
	Account(int a) {
		this.acc = a;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public int getAcc() {
		return acc;
	}
	public void setAcc(int acc) {
		this.acc = acc;
	}
	public void deposit(double sum) {
		if(sum > 0) {
			this.bal += sum;
		}
	}
	public void withdraw(double sum) {
		if(sum > 0 && bal > 0 && bal > sum) {
			this.bal -= sum;
		}
	}
	@Override
	public String toString() {
		return "{Account Number: " + this.acc + "; Balance: " + this.bal + "}";
	}
	final void print() {
		System.out.println(toString());
	}
}

class SavingsAccount extends Account {

	SavingsAccount(int a) {
		super(a);
	}
	public void addInterest() {
		super.setBal(super.getBal() + 100.0);
	}
	@Override
	public String toString() {
		System.out.println(super.toString());
		System.out.println("{Interest = 100.0}");
		return null;
	}
	
}

public class Bank {

	public static void main(String[] args) {
		SavingsAccount accs[] = new SavingsAccount[2];
		SavingsAccount acc1 = new SavingsAccount(1);
		SavingsAccount acc2 = new SavingsAccount(2);
		accs[0] = acc1;
		accs[1] = acc2;
		for(SavingsAccount acc: accs) {
			acc.deposit(1000.00);
			acc.withdraw(50.00);
			acc.deposit(100.00);
			acc.addInterest();
			acc.withdraw(500);
			acc.toString();
		}
	}

}