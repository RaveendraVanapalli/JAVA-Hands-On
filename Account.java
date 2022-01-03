package AccountManipulation;

abstract public class Account{
	protected int accountnumber;
	private Customer obj;
	protected double balance;
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Customer getObj() {
		return obj;
	}
	public void setObj(Customer obj) {
		this.obj = obj;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int accountnumber,Customer obj,double balance) {
		this.obj=obj;
		this.accountnumber=accountnumber;
		this.balance=balance;
	}
	abstract public boolean withdraw(double amount);

}
