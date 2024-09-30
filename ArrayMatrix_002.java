//Sum of a Diagonal in 2D Array/Matrix

import java.util.*;

class MaSumDia2
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		int col = 0;
		int arr[][] = new int[3][3];
		
		//Loop for Input in Matrix
		for(a = 0; a < 3; a++)
		{
			for(b = 0; b < 3; b++)
			{
				System.out.println("Enter the Value = ");
				arr[a][b] = input.nextInt();
			}
		}
		
		//Loop to Print the Matrix
		for(a = 0; a < 3; a++)
		{
			for(b = 0; b < 3; b++)
			{
				System.out.println(arr[a][b] + " ");
				col = col + arr[b][a];
			}
			System.out.println(col + "\n");
			col = 0;
		}
	}
}