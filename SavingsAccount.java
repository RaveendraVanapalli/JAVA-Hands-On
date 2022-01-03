package AccountManipulation;

public class SavingsAccount extends Account{
	private double minimumbalance;
	public double getMinimumbalance() {
		return minimumbalance;
	}

	public void setMinimumbalance(double minimumbalance) {
		this.minimumbalance = minimumbalance;
	}
	public SavingsAccount(int accountnumber,Customer obj,double balance,double minimumbalance) {
		super(accountnumber,obj,balance);
		this.minimumbalance=minimumbalance;
	}
	public boolean withdraw(double amount) {
		if((balance-amount)<minimumbalance) {
			balance=balance-amount;
			return true;
		}else {
			return false;
		}
	}

}
