import java.util.Scanner;

public class WhiPatA
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a = 1;
		
		while(a <= 4)
		{
				int b = 1;
				while(b <= a)
				{
					System.out.print("x");
					
					b++;
				}
				
			a++;
			System.out.print("\n");	
		}
	}      
}