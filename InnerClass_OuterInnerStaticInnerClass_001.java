//Inner Class

class OuterPrc6
{
	private static String message = "Hello from Outer Class";
	
	static class Nested
	{
		void display()
		{
			System.out.println(message);
		}
	}
	
	
	//Main
	public static void main(String args[])
	{
		OuterPrc6.Nested out = new OuterPrc6.Nested();
		
		out.display();
	}
}