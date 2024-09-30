import java.util.Scanner;

//Print Table of Any Number

class ForSix
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int num;
		
		for(num = 1; num <= 10; num++)
		{
			System.out.print(num * 6);
			System.out.print("\n");
		}
	}
}