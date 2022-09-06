package day4.Q3;

public class AccountDemo {

	public static void main(String[] args) throws InsufficientFundException {
		// TODO Auto-generated method stub
		
		System.out.println("Start of main");
		
		Account ac = new Account("123456789012",500);
		ac.deposit(2000);
		ac.deposit(200);
		try {
		System.out.println(ac.withdraw(700)+".rs Withdraw Successful!!");
		System.out.println(ac.withdraw(1500)+".rs Withdraw Successful!!");
		System.out.println(ac.withdraw(600)+".rs Withdraw Successful!!");
		}catch (InsufficientFundException IE) {
			// TODO: handle exception
			System.out.println(IE.getMessage());
		}
		System.out.println("End of main");

	}

}
