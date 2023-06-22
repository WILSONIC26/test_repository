package DEMO;

import java.util.Scanner;

   public class QuizProgramV2 {

	public static void main(String[] args) {
		
			// Declaring variables here
			int n;
			
			// Creating user input
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				// Display the quiz options
				System.out.println("Who is the founder of Blue Origin?");
				System.out.println("1. Bill Gates\n2. Tim Cook\n3. Nadella\n.4 Jeff Bezos\5. Exit Program");
				
				// Reading user input
				System.out.println(" Enter your choice(1,2,3,4)?");
				n = sc.nextInt();	
				
				// Validating Input
				if( n == 4 ) {
					System.out.println("Congratulations!! You have answered correctly");
					
				// Program will exit as correct answer given
					break;
				}
				// Option added to exit manually
				else if ( n == 5) {
					break;
				}
				else {
					System.out.println("Sorry that is incorrect, please try again.");
				
					
			}
				
		}
	}
 }
