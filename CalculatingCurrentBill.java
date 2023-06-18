package statements;

import java.util.Scanner;

public class CalculatingCurrentBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the unit:");
		int unit = sc.nextInt();
		float price = 0;
		
		
		if(unit<=0) 
		{
			System.out.println("Invalid input try again..");
			System.exit(0);
		}
		if(unit>=1 && unit<=100)
		{
			price = 2 * unit;
			
		}
		else if(unit>100 && unit<=300)
		{
			price = 100 * 2 + (unit-100) * 2 ;
			
		}
		else if(unit > 300)
		{
			price = 100 * 2 + 200 * 3 + (unit-100) * 4;
			
		}
		System.out.println("The current bill for " +unit+ " is : " +price);
	}

}
