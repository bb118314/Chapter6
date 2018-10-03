package practice;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 int high = 0;
		 int low = 100;
		 int avg = 0;
		 int count = 0;
		 int total = 0;
		 int userChoice = 0;
		 int quit = 0;
		 while(userChoice != 999) {
			 
		 
		 
			 System.out.println("Enter a test score. To exit, enter 999 >> ");
			 userChoice = input.nextInt();
		 
			 
			 
			 if(userChoice > high && userChoice < 101) {
				 high = userChoice;
				 count = count + 1;
				 avg = avg + userChoice;

			 }
			 else if(userChoice < low) {
				 low = userChoice;
				 count = count + 1;
				 avg = avg + userChoice;
			 }
			 else if(userChoice < 101 && userChoice >= 0) {
				 count = count + 1;
				 avg = avg + userChoice;
			 }
			 else if(userChoice == 999) {
				 System.out.println("You Quit");
			 }
			 else if(userChoice > 100 || userChoice < 0) {
				 System.out.println("Not a valid test score");
			 }

		 
		 				}
		 if(userChoice == 999) {
			 avg = avg / count;
			 System.out.println("You entered " + count + " tests");
			 System.out.println("The highest test score is " + high);
			 System.out.println("The lowest test score is " + low);
			 System.out.println("The average test score is " + avg);
		 }
	}

}
