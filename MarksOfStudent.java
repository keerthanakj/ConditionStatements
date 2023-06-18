package statements;

import java.util.Scanner;

public class MarksOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of the Student:");
		num = sc.nextInt();
		if(num>=90 && num<=100) {
			System.out.println("Student grade is A+");
		}else if(num>=70 && num<=89) {
			System.out.println("Student grade is A");
		}else if(num>=50 && num<=69) {
			System.out.println("Student grade is B+");
		}else if(num>=35 && num<=49) {
			System.out.println("Student grade is B");
		}else if(num>=0 && num<=34){
			System.out.println("Student Failed");
		}else {
			System.out.println("Number is invaild");
		}
	}
}
