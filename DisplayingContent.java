package DEMO;

import java.util.Scanner;

public class DisplayingContent {
	public static void main(String[] args) {
		// Factorial program example
		// 3! = 1 * 2 * 3 = 6
		// 5! = 1 * 2 * 3 * 4 * 5 = 120
		
		//Declaring variables here
		int n;
		int fact_var = 1;
		
		//Creating object scanner here
		Scanner sc = new Scanner(System.in);
		
		//Reading input from user
		System.out.println("Enter a number? ");
		n= sc.nextInt();
		
		//Calculating factorial
		for(int i = 1; i<= n; i++) {
			fact_var = fact_var * i;
			}
		
		//Displaying the factorial here
		System.out.println("Factorial of the number "+n+" is: "+fact_var);

	}

}
