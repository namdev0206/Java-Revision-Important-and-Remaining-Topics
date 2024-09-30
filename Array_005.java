//To find the Second smallest element in an Array

import java.util.Arrays;

class Array5
{
	public static void main(String args[])
	{
		int[] my_array = {-1, 4, 0, 2, 7, -3};
		
		System.out.println("Original Numeric Array : " + Arrays.toString(my_array));
		
		int min = Integer.MAX_VALUE;
		
		int second_min = Integer.MAX_VALUE;
		
		for(int i = 0; i < my_array.length; i++)
		{
			if(my_array[i] == min)
			{
				second_min = min;
			}
			else if(my_array[i] < min)
			{
				second_min = min;
				min = my_array[i];
			}
			else if(my_array[i] < second_min)
			{
				
			}
			
		}
		System.out.println("Second lowest number is : " + second_min);
	}
}