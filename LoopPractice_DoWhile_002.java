import java.util.Scanner;

//All Natural Numbers Reverse using For Loop
class DoWhileTwo
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a = 10;
		
		do
		{
			System.out.print(a);
			
			System.out.print("\n");
			
			a--;
		}
		while(a >= 1);
	}
}