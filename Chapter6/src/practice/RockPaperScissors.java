package practice;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int guess;
		int number;
		int score = 0;
		int score2 = 0;
		int test = 0;
		do {
		 System.out.println("Choose a number to select your weapon\n-1 Rock\n-2 Paper\n-3 Scissors ");
		 guess = input.nextInt();
		 
		 number = (1  + (int)(Math.random() * 3));
		 if(guess == 1) 
		 {
			 if(number == 2) 
			 {
				 score2 += 1;
				 System.out.println("Your opponent chose paper.");
				 System.out.println("You chose rock and lost to paper!");
				 System.out.println("The score is " + score + "-" + score2 + ".");
				 System.out.println(" ");
			 }
			 else if(number == 1)
			 {
				 System.out.println("Your opponent chose rock.");
				 System.out.println("You both chose rock and tied!");
				 System.out.println("The score is " + score + "-" + score2 + ".");
				 System.out.println(" ");
			 }
			 else if(number == 3)
			 {
				 score += 1;
				 System.out.println("Your opponent chose scissors.");
				 System.out.println("You chose rock and won against scissors!");
				 System.out.println("The score is " + score + "-" + score2 + ".");
				 System.out.println(" ");
			 }
		 }
		 else if(guess == 2)
		 {
			 if(number == 2) 
			 {
				 System.out.println("Your opponent chose paper.");
				 System.out.println("You both chose paper and tied!");
				 System.out.println("The score is " + score + "-" + score2 + ".");
				 System.out.println(" ");
			 }
			 else if(number == 1)
			 {
				 score += 1;
				 System.out.println("Your opponent chose rock.");
				 System.out.println("You chose paper and won against rock!");
				 System.out.println("The score is " + score + "-" + score2 + ".");
				 System.out.println(" ");
			 }
			 else if(number == 3)
			 {
				 score2 += 1;
				 System.out.println("Your opponent chose scissors.");
				 System.out.println("You chose paper and lost against scissors!");
				 System.out.println("The score is " + score + "-" + score2 + ".");
				 System.out.println(" ");
			 }
		 }
		 else if(guess == 3)
		 {
			 if(number == 2) 
			 {
				 score += 1;
				 System.out.println("Your opponent chose paper.");
				 System.out.println("You chose scissors and won against paper!");
				 System.out.println("The score is " + score + "-" + score2 + ".");
				 System.out.println(" ");
			 }
			 else if(number == 1)
			 {
				 score2 += 1;
				 System.out.println("Your opponent chose rock.");
				 System.out.println("You chose scissors and lost against rock!");
				 System.out.println("The score is " + score + "-" + score2 + ".");
				 System.out.println(" ");
			 }
			 else if(number == 3)
			 {
				 System.out.println("Your opponent chose scissors.");
				 System.out.println("You both chose scissors and tied!");
				 System.out.println("The score is " + score + "-" + score2 + ".");
				 System.out.println(" ");
			 }
		 }
		 else {  System.out.println("You lost because you suck at following instructions!");
		 score2 += 999; 
		 }
		 if (test <= 5 && score > score2) {
			 	System.out.println("You won!");
				System.out.println("The final score is " + score + "-" + score2);
			}
		 else if (test <= 5 && score < score2) {
			 	System.out.println("You lost!");
				System.out.println("The final score is " + score + "-" + score2);
			}
		 else if (test <= 5 && score == score2) {
			 	System.out.println("You tied!");
				System.out.println("The final score is " + score + "-" + score2);
			}
		 test = test + 1;
		}while(test <= 5);
		

	}

}