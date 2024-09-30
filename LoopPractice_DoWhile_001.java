import java.util.Scanner;

//All Natural Numbers using For Loop
class DoWhileOne
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a = 1;
		
		do
		{
			System.out.print(a);
			
			System.out.print("\n");
			
			a++;
		}
		while(a <= 10);
	}
}