import java.util.Scanner;

//Print Table of Any Number

class WhileSix
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int num = 1 ;
		
		while(num <= 10)
		{
			System.out.print(num * 6);
			System.out.print("\n");
			
			num++;
		}
	}
}