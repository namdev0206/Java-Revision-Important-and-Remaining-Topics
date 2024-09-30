import java.util.Scanner;

class Sixth
{
	public static void main(String args[])
	{
		int year;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Year to Check Year is Leap Yr. or Normal Yr. = ");
		year = input.nextInt();
		
		
	/*
		* If year is exactly divisible by 4  and year is not divisible by 100
		* or year is exactly divisible by 400 then
		* the year is leap year.
		* Else year is normal year
    */
	 
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			System.out.print(year + " is Leap Year.");
		}
		else
		{
			System.out.print(year + " is Normal Year.");
		}
	}
}