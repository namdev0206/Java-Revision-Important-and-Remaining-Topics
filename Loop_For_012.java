import java.util.Scanner;

class Rp
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a, b, k;
		
		for(a = 5; a >=1; a--)
		{
			for(b=1;b<=5-a;b++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=7;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
	}      
}