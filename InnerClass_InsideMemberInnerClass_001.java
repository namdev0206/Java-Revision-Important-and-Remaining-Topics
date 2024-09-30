//Inner Class

class InsideMemberInnerClass
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
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.display();
	}
}
