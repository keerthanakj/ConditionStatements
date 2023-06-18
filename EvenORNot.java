package statements;

import java.util.Scanner;

public class EvenORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:"); 
		num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println(num+" is even number");
		}
		else 
		{
			System.out.println(num+" is not even number");
		}
	}

}
