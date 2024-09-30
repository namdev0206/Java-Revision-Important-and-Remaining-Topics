import java.util.Scanner;

class PatIFP
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a, b, k;
		
		for(a = 5; a >= 1; a--)
		{
			for(k = 1; k <= (5 - a); k++)
			{
				System.out.print(" ");
			}
			
			for(b = 1; b <= (2*a-1); b++)
			{
				if(b % 2 == 0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("x");
				}
			}
		System.out.print("\n");
		}
	}      
}