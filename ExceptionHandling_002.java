//Exception Handling
//Those types of error which are occur by user mistake

import java.util.*;

class ExceptionHand2
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		//Try&Catch is used if the code gets error in a line then the code will be executed with rest part
		
		try
		{
		System.out.println("Enter the First number ");
		a = input.nextInt();
		
		System.out.println("Enter the Second number ");
		b = input.nextInt();
		
		c = a / b;
		System.out.println("Value of a / b is " + c);
		}
		
		//If there is an input error we'll use (InputMismatchException ex)
		catch(InputMismatchException ex)
		{
			System.out.println("Input Mismatch");
		}
		
		//If there is an Arithmetic/Mathematical error we'll use (ArithmeticException ex1)
		catch(ArithmeticException ex1)
		{
			//To get the Error Message
			System.out.println("Related to Math "+ ex1.getMessage());
			
			//
			System.out.println("Related to Math "+ ex1.toString());
			
			//To Trace the Error
			ex1.printStackTrace();
		}
		
		//If there is an Unkown Error we use (Exception ex))
		catch(Exception ex)
		{
			System.out.println("Sorry there's an input error");
		}
		
		
		
		System.out.println("Rest code will be Executed");
	}
}