//Inner Class

class OuterPrc5
{
	private String message = "Hello from Outer Class";
	
	class Inner
	{
		void display()
		{
			System.out.println(message);
		}
	}
	
	
	//Main
	public static void main(String args[])
	{
		OuterPrc5 out = new OuterPrc5();
		OuterPrc5.Inner in = out.new Inner();
		in.display();
	}
}