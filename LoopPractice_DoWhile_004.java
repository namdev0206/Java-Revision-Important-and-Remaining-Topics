import java.util.Scanner;

//All Odd Numbers from 1 - 100

class DoWhileFour
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a = 1;
		
		do
		{
			if(a % 2 == 1)
			{
				System.out.print(a);
				System.out.print("\n");
			}
			a++;
		}
		while(a <= 100);
	}
}