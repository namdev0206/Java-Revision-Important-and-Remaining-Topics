import java.util.Scanner;

class ForPatO
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a,b;
		
		for(a = 4; a >= 1; a--)
		{
			for(b = 1; b <= (2*a-1); b++)
			{
				System.out.print("x");
			}
			System.out.print("\n");
		}
	}
}