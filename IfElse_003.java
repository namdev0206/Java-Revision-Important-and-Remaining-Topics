import java.util.Scanner;

class Fourth
{
	public static void main(String args[])
	{
		int a;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the Value to Check the Number is Divisible by 5 and 11 = ");
		a = input.nextInt();
		
		if(a%5 == 0 && a%11 == 0)
		{
			System.out.print(a + " is Divisible by 5 and 11.");
		}
		else
		{
			System.out.print(a + " is not Divisible by 5 and 11");
		}
	}
}