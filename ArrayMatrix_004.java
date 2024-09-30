//Matrix - Array

import java.util.*;

class MaSumDia4
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int a, b, c;
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
				if(a + b == 2)
				{
					col = col + arr[a][b];
				}
			}
			
			System.out.println();
		}
		System.out.println(col);
	}
}