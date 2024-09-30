import java.util.Scanner;

public class WhiPatB
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a = 5;
		
		while(a >= 1)
		{
				int b = 1;
				while(b <= a)
				{
					System.out.print("x");
					
					b++;
				}
				
			a--;
			System.out.print("\n");	
		}
	}      
}