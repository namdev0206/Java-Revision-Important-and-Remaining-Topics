import java.util.Scanner;

//All Odd Numbers from 1 - 100

class ForFour
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a;
		
		for(a = 1; a <= 100; a++)
		{
			if(a % 2 == 1)
			{
				System.out.print(a);
				System.out.print("\n");
			}
		}
	}
}