package ch06.test;

public class Account {
	protected int balance;
	final int MIN_BALANCE =0;
	final int MAX_BALANCE =1000000;
	
	Account()
	{
		
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE && balance<=MAX_BALANCE)
		{
			this.balance = balance;
		}
		else
		{
			this.balance = getBalance();
		}
		
		
	}
	
}
