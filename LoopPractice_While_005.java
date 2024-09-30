import java.util.Scanner;

//Add Sum of All Natural Number B/w 1-10

class WhileFive
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int num = 1;
		int sum = 0;
		
		while(num <= 10)
		{
			sum = sum + num;
			num++;
		}
		
		System.out.print(sum);
	}
}