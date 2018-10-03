package practice;
import java.util.Scanner;
public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int skill;
		int hours;
		int insurance;
		double retirecost;
		double pay;
		double overtime;
		double finalpay;
		double netpay;
		int retire;
		Scanner input = new Scanner(System.in);
		System.out.println("Barnhill Fastener Company employee pay application");
		System.out.println("Enter your skill level (1-3): ");
		skill = input.nextInt();
		System.out.println("How many hours have you worked?");
		hours = input.nextInt();
		
		if(skill == 1)
		{
			if(hours > 40)
			{
				pay = 40 * 17;
				overtime = (hours - 40) * 17 * 1.5;
				finalpay = pay + overtime;
				System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
				System.out.println("You receive $17 an hour");
				System.out.println("You recieved $" + pay + " in regular pay");
				System.out.println("You recieve $" + overtime + " overtime");
				System.out.println("You recieved $" + finalpay + " for your final pay");

			}
			else if( hours < 41)
			{
				pay = hours * 17;
				overtime = 0;
				finalpay = pay;
				System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
				System.out.println("You receive $17 an hour");
				System.out.println("You recieved $" + finalpay + " in regular pay");
				System.out.println("You did not recieve any overtime");
				System.out.println("You recieved $" + finalpay + " for your final pay");
			}

		}
		
		
		else if(skill == 2)
		{
			if(hours > 40)
			{
				pay = 40 * 20;
				overtime = (hours - 40) * 20 * 1.5;
				System.out.println("Which insurance option would you like?");
				System.out.println("-1 Medical insurance\n-2 Dental insurance \n-3 Long-term disability insurance\n-4 Nothing");
				insurance = input.nextInt();
				if(insurance == 1)
				{
					finalpay = pay + overtime;
					netpay = finalpay - 32.50;
					System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
					System.out.println("You receive $20 an hour");
					System.out.println("You recieved $" + pay + " in regular pay");
					System.out.println("You recieve $" + overtime + " overtime");
					System.out.println("You recieved $" + finalpay + " for your final pay");
					System.out.println("You opted for Medical Insurance");
					System.out.println("Your net pay is $" + netpay);
				}
				if(insurance == 2)
				{
					finalpay = pay + overtime;
					netpay = finalpay - 20;
					System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
					System.out.println("You receive $20 an hour");
					System.out.println("You recieved $" + pay + " in regular pay");
					System.out.println("You recieve $" + overtime + " overtime");
					System.out.println("You recieved $" + finalpay + " for your final pay");
					System.out.println("You opted for Medical Insurance");
					System.out.println("Your net pay is $" + netpay);
				}
				if(insurance == 3)
				{
					finalpay = pay + overtime;
					netpay = finalpay - 10;
					System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
					System.out.println("You receive $20 an hour");
					System.out.println("You recieved $" + pay + " in regular pay");
					System.out.println("You recieve $" + overtime + " overtime");
					System.out.println("You recieved $" + finalpay + " for your final pay");
					System.out.println("You opted for Medical Insurance");
					System.out.println("Your net pay is $" + netpay);
				}
				if(insurance == 4)
				{
					finalpay = pay + overtime;
					netpay = finalpay;
					System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
					System.out.println("You receive $20 an hour");
					System.out.println("You recieved $" + pay + " in regular pay");
					System.out.println("You recieve $" + overtime + " overtime");
					System.out.println("You recieved $" + finalpay + " for your final pay");
					System.out.println("You did not choose insurance");
					System.out.println("Your net pay is $" + netpay);
				}
			}
			else if( hours < 41)
			{
				pay = hours * 20;
				overtime = 0;
				System.out.println("Which insurance option would you like?");
				System.out.println("-1 Medical insurance\n-2 Dental insurance \n-3 Long-term disability insurance");
				insurance = input.nextInt();
				if(insurance == 1)
				{
					finalpay = pay;
					netpay = finalpay - 32.50;
					System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
					System.out.println("You receive $20 an hour");
					System.out.println("You recieved $" + pay + " in regular pay");
					System.out.println("You did not get overtime");
					System.out.println("You recieved $" + finalpay + " for your final pay");
					System.out.println("You opted for Medical Insurance");
					System.out.println("Your net pay is $" + netpay);
				}
				if(insurance == 2)
				{
					finalpay = pay;
					netpay = finalpay - 20;
					System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
					System.out.println("You receive $20 an hour");
					System.out.println("You recieved $" + pay + " in regular pay");
					System.out.println("You did not get overtime");
					System.out.println("You recieved $" + finalpay + " for your final pay");
					System.out.println("You opted for Medical Insurance");
					System.out.println("Your net pay is $" + netpay);
				}
				if(insurance == 3)
				{
					finalpay = pay;
					netpay = finalpay - 22;
					System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
					System.out.println("You receive $20 an hour");
					System.out.println("You recieved $" + pay + " in regular pay");
					System.out.println("You did not get overtime");
					System.out.println("You recieved $" + finalpay + " for your final pay");
					System.out.println("You opted for Medical Insurance");
					System.out.println("Your net pay is $" + netpay);
				}
				if(insurance == 4)
				{
					finalpay = pay;
					netpay = finalpay;
					System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
					System.out.println("You receive $20 an hour");
					System.out.println("You recieved $" + pay + " in regular pay");
					System.out.println("You did not get overtime");
					System.out.println("You recieved $" + finalpay + " for your final pay");
					System.out.println("You opted for Medical Insurance");
					System.out.println("Your net pay is $" + netpay);
				}
			}

		}
		
		
		else if(skill == 3)
		{
			if(hours > 40)
			{
				pay = 40 * 22;
				overtime = (hours - 40) * 22 * 1.5;
				System.out.println("Which insurance option would you like?");
				System.out.println("-1 Medical insurance\n-2 Dental insurance \n-3 Long-term disability insurance\n-4 Nothing");
				insurance = input.nextInt();
				if(insurance == 1)
				{
					finalpay = pay + overtime;
					System.out.println("Would you like to participate in the retirement program? (3% of paycheck)\n-1 Yes \n-2 No");
					retire = input.nextInt();
					if(retire == 1)
					{
						retirecost = finalpay * 0.03;
						netpay = finalpay - 32.50 - retirecost;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You recieve $" + overtime + " overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Medical Insurance");
						System.out.println("You opted for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
					else if(retire == 2)
					{
						netpay = finalpay - 32.50;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You recieve $" + overtime + " overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Medical Insurance");
						System.out.println("You did not opt for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}

				}
				if(insurance == 2)
				{
					finalpay = pay + overtime;
					System.out.println("Would you like to participate in the retirement program? (3% of paycheck)\n-1 Yes \n-2 No");
					retire = input.nextInt();
					if(retire == 1)
					{
						retirecost = finalpay * 0.03;
						netpay = finalpay - 20 - retirecost;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You recieve $" + overtime + " overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Dental Insurance");
						System.out.println("You opted for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
					else if(retire == 2)
					{
						netpay = finalpay - 20;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You recieve $" + overtime + " overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Dental Insurance");
						System.out.println("You did not opt for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
				}
				if(insurance == 3)
				{
					finalpay = pay + overtime;
					System.out.println("Would you like to participate in the retirement program? (3% of paycheck)\n-1 Yes \n-2 No");
					retire = input.nextInt();
					if(retire == 1)
					{
						retirecost = finalpay * 0.03;
						netpay = finalpay - 10 - retirecost;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You recieve $" + overtime + " overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Long-Term disability insurance");
						System.out.println("You opted for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
					else if(retire == 2)
					{
						netpay = finalpay - 10;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You recieve $" + overtime + " overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Long-Term disability insurance");
						System.out.println("You did not opt for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
				}
				if(insurance == 4)
				{
					finalpay = pay + overtime;
					System.out.println("Would you like to participate in the retirement program? (3% of paycheck)\n-1 Yes \n-2 No");
					retire = input.nextInt();
					if(retire == 1)
					{
						retirecost = finalpay * 0.03;
						netpay = finalpay - retirecost;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You recieve $" + overtime + " overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Long-Term disability insurance");
						System.out.println("You opted for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
					else if(retire == 2)
					{
						netpay = finalpay;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You recieve $" + overtime + " overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Long-Term disability insurance");
						System.out.println("You did not opt for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
				}			}
			else if( hours < 41)
			{
				pay = 40 * 22;
				System.out.println("Which insurance option would you like?");
				System.out.println("-1 Medical insurance\n-2 Dental insurance \n-3 Long-term disability insurance\n-4 Nothing");
				insurance = input.nextInt();
				if(insurance == 1)
				{
					finalpay = pay;
					System.out.println("Would you like to participate in the retirement program? (3% of paycheck)\n-1 Yes \n-2 No");
					retire = input.nextInt();
					if(retire == 1)
					{
						retirecost = finalpay * 0.03;
						netpay = finalpay - 32.50 - retirecost;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You did not recieve overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Medical Insurance");
						System.out.println("You opted for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
					else if(retire == 2)
					{
						netpay = finalpay - 32.50;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You did not recieve overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Medical Insurance");
						System.out.println("You did not opt for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}

				}
				if(insurance == 2)
				{
					finalpay = pay;
					System.out.println("Would you like to participate in the retirement program? (3% of paycheck)\n-1 Yes \n-2 No");
					retire = input.nextInt();
					if(retire == 1)
					{
						retirecost = finalpay * 0.03;
						netpay = finalpay - 20 - retirecost;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You did not recieve overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Dental Insurance");
						System.out.println("You opted for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
					else if(retire == 2)
					{
						netpay = finalpay - 20;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You did not recieve overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Dental Insurance");
						System.out.println("You did not opt for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
				}
				if(insurance == 3)
				{
					finalpay = pay;
					System.out.println("Would you like to participate in the retirement program? (3% of paycheck)\n-1 Yes \n-2 No");
					retire = input.nextInt();
					if(retire == 1)
					{
						retirecost = finalpay * 0.03;
						netpay = finalpay - 10 - retirecost;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You did not recieve overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Long-Term disability insurance");
						System.out.println("You opted for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
					else if(retire == 2)
					{
						netpay = finalpay - 10;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You did not recieve overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Long-Term disability insurance");
						System.out.println("You did not opt for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
				}
				if(insurance == 4)
				{
					finalpay = pay;
					System.out.println("Would you like to participate in the retirement program? (3% of paycheck)\n-1 Yes \n-2 No");
					retire = input.nextInt();
					if(retire == 1)
					{
						retirecost = finalpay * 0.03;
						netpay = finalpay - retirecost;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You did not recieve overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Long-Term disability insurance");
						System.out.println("You opted for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
					else if(retire == 2)
					{
						netpay = finalpay;
						System.out.println("You worked " + hours + " hours this week and are skilled at level " + skill);
						System.out.println("You receive $22 an hour");
						System.out.println("You recieved $" + pay + " in regular pay");
						System.out.println("You did not recieve overtime");
						System.out.println("You recieved $" + finalpay + " for your final pay");
						System.out.println("You opted for Long-Term disability insurance");
						System.out.println("You did not opt for the Retirement Plan");
						System.out.println("Your net pay is $" + netpay);
					}
				}
			}
		}

	}

}