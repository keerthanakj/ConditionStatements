package statements;

import java.util.Scanner;

public class AreaSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("*********Menu*********");
		System.out.println("1.Area of Square");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Area of Circle");
		System.out.println("4.Area of Triangle");
		
		System.out.println("Enter Your Choice:");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:System.out.println("Enter the side ");
				int side = sc.nextInt();
				float	areasq = side*side;
				System.out.println("Area of Square is "+areasq);
				break;
			case 2:System.out.println("Enter the length:");
				float length = sc.nextFloat();
				System.out.println("Enter the width:");
				float width = sc.nextFloat();
				float areare = length * width;
				System.out.println("Area of rectangle is "+areare);
				break;
			case 3:System.out.println("Enter the radius:");
				float r = sc.nextFloat();
				float PI=3.14159f;
				float areaci = PI * r * r;
				System.out.println("Area of Circle "+areaci);
				break;
			case 4:System.out.println("Enter the base:");
		       float base=sc.nextFloat();
		       System.out.println("Enetr the height:");
		       float height= sc.nextFloat();
		       float areatri = 0.5f * height * base;
		       System.out.println("Area of triangle is "+areatri);
		       break;
			default:System.out.println("invalid input");
		}
		
	}

}
