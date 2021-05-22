
public class SavingAc extends BankAccount{
	private double rateOfInterest;
	private String panCard;
	
	public SavingAc() {	
	}
	
	public SavingAc(double rateOfInterest, String panCard) {
		super(0, null, 0.0);
		this.rateOfInterest = rateOfInterest;
		this.panCard = panCard;
	}

	public SavingAc(int accNo, String name, double bal, String panCard) {
		super(accNo, name, bal);
		setPanCard(panCard);
	}
	
	public SavingAc(int accNo, String name, double bal) {
		this(accNo, name, bal, null);
	}
	
	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	@Override
	public String toString() {
		return "SavingAc [rateOfInterest=" + rateOfInterest + ", panCard=" + panCard + "]";
	}
	
	//Method OVerriding
	@Override
	public int withdraw(double amt) {
		return super.withdraw(amt);
	}
	
	public boolean deposit(double amt) {
		return super.deposit(amt);
	}
}
