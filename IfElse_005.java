import java.util.Scanner;

class Fifth
{
	public static void main(String args[])
	{
		int a;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the Value to Check Number is Even or Odd = ");
		a = input.nextInt();
		
		if(a%2 == 0)
		{
			System.out.print(a + " is an Even Number.");
		}
		else
		{
			System.out.print(a + " is an odd Number.");
		}
	}
}