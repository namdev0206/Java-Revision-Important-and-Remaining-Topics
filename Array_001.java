import java.util.Arrays;

class Array1
{
	public static void main(String args[])
	{
		
		// Initialize my_array with some values
		int[] my_array = {1, 2, 3, 3, 5};
		
		System.out.println("Original Array: ");
		
		for(int i = 0; i < my_array.length; i++)
		{
			System.out.println(my_array[i] + "\t");
		}
		
		//Assuming all Elements in input array are Unique
		int no_unique_elements = my_array.length;
		
		//Comparing each element with all other elements
		for(int i = 0; i < no_unique_elements; i++)
		{
			for(int j = i+1; j < no_unique_elements; j++)
			{
				//If any two elements are found Equals
				if(my_array[i] ==  my_array[j])
				{
					//Replace duplicate elements with last unique elements
					my_array[j] = my_array[no_unique_elements - 1];
					no_unique_elements--;
					j--;
				}
			}
		}
	}
}