package statements;

import java.util.Scanner;

public class EvenOrOddSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		switch(num%2)
		{
		case 0:
		    System.out.println(num+" is a Even number");
		    break;
		case 1:
		    System.out.println(num+" is a Odd number");
		}
	}

}
