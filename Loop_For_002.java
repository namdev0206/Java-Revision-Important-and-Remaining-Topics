import java.util.Scanner;

class ForEven
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int i, str, end;
		
		System.out.println("Enter Starting Value = ");
		str = input.nextInt();
		
		System.out.println("Enter Ending Value = ");
		end = input.nextInt();
		
		for(i = str; i <= end; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}