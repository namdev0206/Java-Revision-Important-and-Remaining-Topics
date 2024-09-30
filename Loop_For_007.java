import java.util.Scanner;

class PatLHP
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a, b, k;
		
		for(a = 1; a <= 5; a++)
		{
			for(k = 1; k <= (5-a); k++)
			{
				System.out.print(" ");
			}
			
			for(b = 1; b <= a; b++)
			{
				System.out.print("x");
			}
			
			System.out.print("\n");
		}
	}
}