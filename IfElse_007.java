import java.util.Scanner;

class Seventh
{
	public static void main(String args[])
	{
		int mrp, disc, finl, fnl;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the MRP of a Product = ");
		mrp = input.nextInt();
		
		System.out.print("Enter the Discount = ");
		disc = input.nextInt();
		
		fnl = ((mrp * disc)/100);
		finl = (mrp - fnl);
		
		System.out.print("Final amount is " + finl);
	}
}