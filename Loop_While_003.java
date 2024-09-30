import java.util.Scanner;

public class WhiFac
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		int a = 1;
		int fac = 1;
		
		while(a <= 4)
		{
			fac = a * fac;
			
			a++;
		}
		
		System.out.print(fac);
	}      
}