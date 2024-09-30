//Inner Class

class OuterPrc7
{
	void methodWithInnerClass()
	{
		Runnable r = new Runnable()
		{
			public void run()
			{
				System.out.println("Inside Anonymous Inner Class in Method Argument");
			}
		};
		
		new Thread(r).start();
	}
	
	
	//Main
	public static void main(String args[])
	{
		OuterPrc7 out = new OuterPrc7();
		
		out.methodWithInnerClass();
	}
}