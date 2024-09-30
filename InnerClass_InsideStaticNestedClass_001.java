//Inner Class - Static

class OuterPrc2
{
	static class Nested
	{
		void display()
		{
			System.out.println("Inside Static Nested Class");
		}
	}
	
	
	//Main
	public static void main(String args[])
	{
		OuterPrc2.Nested nes = new OuterPrc2.Nested();
		nes.display();
	}
}