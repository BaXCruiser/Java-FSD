//Complete Class
//Java Bean
//POJO - Plain Old Java Object
public class BankAccount {
	private int accNo;
	private String name;
	private double bal;
	
	public BankAccount() {		
	}

	public BankAccount(int accNo, String name, double bal) {
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
	}
	//Fetch data -- Accessor method
	public int getAccNo() {
		return accNo;
	}

	// Mutator method
	// insert / update / delete
	private void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	private void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", name=" + name + ", bal=" + bal + "]";
	}
	
	//Business Logic Method
	// Processing
	public int withdraw(double amt) {
		if(amt < 0) {
			return -1;
		} else if(amt > bal) {
			return 0;
		}
		bal = bal - amt;
		return 1;
	}
	
	public boolean deposit(double amt) {
		if(amt < 0) {
			return false;
		}
		setBal(getBal() + amt);
		return true;
	}
}
