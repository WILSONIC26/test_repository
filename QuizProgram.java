package DEMO;

import java.util.Scanner;

public class QuizProgram {

	public static void main(String[] args) {
		// Declaring variables here
		int n;
		
		// Creating user input
		Scanner sc = new Scanner(System.in);
		
		// Display the quiz options
		System.out.println("Who is the founder of Blue Origin?");
		System.out.println("1. Bill Gates\n2. Tim Cook\n3. Nadella\n.4 Jeff Bezos");
		
		// reading user input
		System.out.println(" Enter your choice(1,2,3,4)?");
		
		// Validating Input
		n = sc.nextInt();
		
		if( n == 4 ) {
			System.out.println("Congratulations!! You have answered correctly");
		}
		else {
			System.out.println("Sorry that is incorrect, please try again.");
		}

	}

}
