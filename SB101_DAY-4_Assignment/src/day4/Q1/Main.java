package day4.Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		try {
		
		int number = Integer.parseInt(sc.next()) ;
		
		System.out.println("The square value is "+number*number+"\n");
		
		}catch (NumberFormatException NE) {
			// TODO: handle exception
			System.out.println("Entered input is not a valid format for an integer.\n");
		}
		
		
		
		System.out.println("The work has been done successfully");

	}

}
