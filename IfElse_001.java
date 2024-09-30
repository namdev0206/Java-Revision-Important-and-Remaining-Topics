import java.util.Scanner;

class Third
{
	public static void main(String args[])
	{
		int a;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the Value of A = ");
		a = input.nextInt();
		
		if(a > 0)
		{
			System.out.print(a + " is a positive Number.");
		}
		else if(a < 0)
		{
			System.out.print(a + " is a negative Number.");
		}
		else
		{
			System.out.print(a + " is a neutral Number.");
		}
	}
}