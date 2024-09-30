//Inner Class - Local Inner Class

class OuterPrc3
{
	void outerMethod()
	{
		class Local
		{
			void display()
			{
				System.out.println("Inside Local Inner Class");
			}
		}
		
		Local local = new Local();
		local.display();
	}
	
	
	//Main
	public static void main(String args[])
	{
		OuterPrc3 ou = new OuterPrc3();
		ou.outerMethod();
	}
}