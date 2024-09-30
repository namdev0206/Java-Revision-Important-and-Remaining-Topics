//Inner Class

class OuterPrc1
{
	class Inner
	{
		void display()
		{
			System.out.println("Inside Member Inner Class");
		}
	}
	
	
	//Main
	public static void main(String args[])
	{
		OuterPrc1 outer = new OuterPrc1();
		OuterPrc1.Inner inner = outer.new Inner();
		inner.display();
	}
}
