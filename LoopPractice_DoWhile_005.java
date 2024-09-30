import java.util.Scanner;

//Add Sum of All Natural Number B/w 1-10

class DoWhileFive
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int num = 1;
		int sum = 0;
		
		do
		{
			sum = sum + num;
			num++;
		}
		while(num <= 10);
		
		System.out.print(sum);
	}
}