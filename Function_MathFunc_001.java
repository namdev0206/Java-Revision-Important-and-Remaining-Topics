class Random1
{
	public static void main(String args[])
	{
		double arr[];
		arr = new double[8];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = Math.floor(Math.random() * 8)+1;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				if (arr[i] != arr[j]) 
				{
                    System.out.println("Duplicate found: " + arr[i]);
                }
			}
		}
	}
}