package statements;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acBalance=60000;
		int  ammount;
		String transaction;
		Scanner sc= new Scanner(System.in);
		System.out.println("deposit.");
		System.out.println("withdraw.");
		System.out.println("display.");
		System.out.println("Enter Transaction type");
		transaction = sc.next();
		switch(transaction) {
		case "deposit":System.out.println("Enter ammount");
		             ammount= sc.nextInt();
		             acBalance = acBalance + ammount;
		             System.out.println("Account Balance after Deposit is "+acBalance);
		             break;
		case "withdraw":System.out.println("Enter ammount");
		              ammount = sc.nextInt();
		              acBalance = acBalance - ammount;
		              System.out.println("Account Balance after withdraw is "+acBalance);
		              break;
			
		case "display":System.out.println("Total Account balance is "+acBalance);
		             break;
		default:System.out.println("Invalid Input");
		}
	}

}
