import java.util.Scanner;

//Print Even Numbers Between 1 - 100
class DoWhileThree
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a = 1;
		
		do
		{
			if(a % 2 == 0)
			{
				System.out.print(a);
				System.out.print("\n");
			}
			a++;
		}
		while(a <= 100);
	}
}