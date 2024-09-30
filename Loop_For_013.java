import java.util.Scanner;

public class PatFT
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a, b;
		int c = 1;
		
		for(a = 1; a <= 4; a++)
		{
			for(b = 1; b <= a; b++)
			{   
				//char m=(char)b+64;
				System.out.printf("%c",(b+64));
				 
			}
			System.out.print("\n");
		}
	}      
}