package practice;
import java.util.Scanner;
public class CountByAnything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cby;
		int cto;
		System.out.println("What would you like to count to?");
		cto = input.nextInt();
		System.out.println("What would you like to count to by?");
		cby = input.nextInt();
		for(int i = 0; i <= cto; i = i + cby) {
			System.out.println(" " + i);
		}

	}

}