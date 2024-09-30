//Exception Handling
//Those types of error which are occur by user mistake

import java.util.Scanner;

class ExceptionHand
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Enter the First number ");
		a = input.nextInt();
		
		System.out.println("Enter the Second number ");
		b = input.nextInt();
		
		c = a / b;
		
		System.out.println("Value of a / b is " + c);
		
		System.out.println("Rest code will be Executed");
	}
}