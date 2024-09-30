import java.util.Scanner;

//Print Even Numbers Between 1 - 100
class WhileThree
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a =1;
		
		while(a <= 100)
		{
			if(a % 2 == 0)
			{
				System.out.print(a);
				System.out.print("\n");
			}
			
			a++;
		}
	}
}