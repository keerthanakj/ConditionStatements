package statements;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Two number:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if(n1>n2)
		{
			System.out.println(n1+" is larger than "+n2);
		}
		else
		{
			System.out.println(n2+" is larger than "+n1);
		}
	}

}
