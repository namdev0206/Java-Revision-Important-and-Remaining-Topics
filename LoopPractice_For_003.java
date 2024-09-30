import java.util.Scanner;

//Print Even Numbers Between 1 - 100
class ForThree
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a;
		
		for(a = 1; a <= 100; a++)
		{
			if(a % 2 == 0)
			{
				System.out.print(a);
				System.out.print("\n");
			}
		}
	}
}