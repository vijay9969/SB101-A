package day4.Q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter value a:");
		int a = sc.nextInt();
		System.out.println("Enter value b:");
		int b = sc.nextInt();
		System.out.println("The quotient of "+a+"/"+b+" = "+a/b);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("DivideByZeroException caught\n");
			
		}finally {
			System.out.println("Inside finally block");
		}
	}

}
