import java.util.*;

class MaSumDia
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int a, b;
		int row1 = 0;
		int row2 = 0;
		int row3 = 0;
		
		int arr[][] = new int [3][3];
		
		//Loop for input in Matrix
		for(a = 0; a < 3; a++)
		{
			for(b = 0; b < 3; b++)
			{
				System.out.println("Enter the Value ");
				arr[a][b] = input.nextInt();
			}
		}
		
		//Loop to print the Matrix
		for(a = 0; a < 3; a++)
		{
			for(b = 0; b < 3; b++)
			{
				System.out.println(arr[a][b]);
				row1 = row1 + arr[a][b];
			}
			
			System.out.println("=" + row1);
			row1 = 0;
		}
	}
}