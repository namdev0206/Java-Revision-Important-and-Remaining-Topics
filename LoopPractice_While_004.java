import java.util.Scanner;

//All Odd Numbers from 1 - 100

class WhileFour
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a = 1;
		
		while(a <= 100)
		{
			if(a % 2 == 1)
			{
				System.out.print(a);
				System.out.print("\n");
			}
			a++;
		}
	}
}