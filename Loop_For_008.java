import java.util.Scanner;

class PatIRHP
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a, b, k;
		
		for(a = 5; a >= 1; a--)
		{
			for(b = 1; b <= a; b++)
			{
				System.out.print("x");
			}
			System.out.print("\n");
		}
	}      
}