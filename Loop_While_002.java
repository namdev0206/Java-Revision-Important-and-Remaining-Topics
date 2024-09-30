import java.util.Scanner;

public class WhiSum
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a = 1;
		int sum = 0;
		
		while(a <= 10)
		{
			sum = a + sum;
			
			a++;
		}
		
		System.out.print(sum);
	}      
}