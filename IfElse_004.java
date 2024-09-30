import java.util.Scanner;

class Second
{
	public static void main(String args[])
	{
		int a;
		int b;
		int c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Value of A = ");
		a = input.nextInt();
		
		System.out.print("Enter the Value of B = ");
		b = input.nextInt();
		
		System.out.print("Enter the Value of C = ");
		c = input.nextInt();
		
		if(a > b && a > c)
		{
			System.out.print(a + " is greater than " + b + " and " + c);
		}else if(b > a && b > c)
		{
			System.out.print(b + " is greater than " + a + " and " + c);
		}else
		{
			System.out.print(c + " is greater than " + b + " and " + c);
		}
	}
}