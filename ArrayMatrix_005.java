import java.util.*;

class Matrix
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		
		int arr[][] = new int[3][3];
		
		//Loop for uotput in Matrix
		for(a = 0; a < 3; a++)
		{
			for(b = 0; b < 3; b++)
			{
				System.out.println("Enter the Value = ");
				arr[a][b] = input.nextInt();
			}
		}
		
		//Loop to print the Matrix
		for(a = 0; a < 3; a++)
		{
			for(b = 0;  b < 3; b++)
			{
				System.out.println(arr[a][b] + " ");
			}				
			System.out.println("\n");
		}
	}
}