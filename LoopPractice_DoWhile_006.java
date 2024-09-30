import java.util.Scanner;

//Print Table of Any Number

class DoWhileSix
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int num = 1 ;
		
		do
		{
			System.out.print(num * 6);
			System.out.print("\n");
			
			num++;
		}
		while(num <= 10);
	}
}