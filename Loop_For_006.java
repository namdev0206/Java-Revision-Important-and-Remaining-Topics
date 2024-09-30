import java.util.Scanner;

class PatRHP
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a,b;
		
		for(a = 1; a <= 5; a++)
		{
			for(b = 1; b <= a; b++)
			{
				System.out.print("x");
			}
			System.out.print("\n");
		}
	}
}