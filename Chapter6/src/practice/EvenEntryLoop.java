package practice;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numChoice;
		do {
			System.out.println("Insert an even number: ");
			 numChoice = input.nextInt();
			 if (numChoice % 2 == 0)
				 System.out.println("Good Job!");
				else
					System.out.println("That is incorrect");

		}while(numChoice != 999);


	}

}
