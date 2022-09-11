package day5.Q3;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		String num = sc.next();
		
//		X number = n -> {
//			return Integer.parseInt(num);
//		};
		
		X number = Integer::parseInt;
		System.out.println(number.convetStringToNumber(num)+100);
		
	}

}
