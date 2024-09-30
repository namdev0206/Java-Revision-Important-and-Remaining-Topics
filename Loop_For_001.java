import java.util.Scanner;

class For
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int i,n;
		int m = 6;
		
		for(i = 1; i <= 10; i++)
		{
			n = m * i;
			System.out.println(n);
		}
	}
}