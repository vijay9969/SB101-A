package day4.Q3;

public class Account {

	String accountNumber;
	double balance;
	
	public void deposit(int amount){
		
		this.balance +=amount;
		
		System.out.println(amount+".rs Deposit Successful!!\n");
	}
	public double withdraw(int amount) throws InsufficientFundException{
		
		Double Balance = 00.0;
		
		if(amount<balance) {
			
			this.balance -=amount;
			Balance = this.balance;
			
			
		}else {
			
			InsufficientFundException IE = new InsufficientFundException("Insufficient balance!!\n");
			throw IE;
		}
		
		return Balance;
		
	}
	public Account(String AccNO, int balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber = AccNO;
		this.balance = balance;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}


}
