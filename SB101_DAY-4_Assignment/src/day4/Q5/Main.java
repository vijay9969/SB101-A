package day4.Q5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InvalidCountryException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = sc.next();
		System.out.println("Enter Your Counry: ");
		String country = sc.next();
		try {
		UserRegistration user = new UserRegistration();
		user.registerUser(name, country);
		}catch (InvalidCountryException IC) {
			// TODO: handle exception
			System.out.println(IC.getMessage());
		}
		
		System.out.println("Thank you!");
	}

}
