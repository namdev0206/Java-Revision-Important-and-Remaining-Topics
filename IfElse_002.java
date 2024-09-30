import java.util.Scanner;

class First
{
	public static void main(String args[])
	{
		int a;
		int b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Value of A = ");
		a = input.nextInt();
		
		System.out.print("Enter the Value of B = ");
		b = input.nextInt();
		
		if(a > b)
		{
			System.out.print(a + " is greater than " + b);
		}else if(a < b)
		{
			System.out.print(b + " is greater than " + a);
		}else
		{
			System.out.print(a + " is equal to " + b);
		}
		
	}
	
}