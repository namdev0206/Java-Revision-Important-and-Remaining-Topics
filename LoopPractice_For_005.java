import java.util.Scanner;

//Add Sum of All Natural Number B/w 1-10

class ForFive
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a;
		int sum = 0;
		
		for(a = 1; a <= 10; a++)
		{
			sum = a + sum;
		}
		
		System.out.print(sum);
	}
}