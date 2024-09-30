import java.util.Scanner;

// Factorial Using DoWhile Loop
public class DoWhiFac
{
	public static void main(String args[])
	{
		int i = 1;
		int fac = 1;
		
		do
		{
			fac = i * fac;
			i++;
		}
		while(i <= 5);

	System.out.print(fac);	
	}      
}