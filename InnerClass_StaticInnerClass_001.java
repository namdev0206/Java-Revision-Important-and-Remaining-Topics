//Static Inner Class (Static Inner Class)

class OuterClass
{
	private static  int data=100;
		 
		static class InnerClass
		{
			int r=10;
			static void readData()
			{
				System.out.println("value of Data "+data);
			}
		} 
}

class StaticIC
{
	public static void main(String args[])
	{
		OuterClass.InnerClass.readData();
	}
}