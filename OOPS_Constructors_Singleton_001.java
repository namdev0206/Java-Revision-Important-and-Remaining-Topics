// Singleton Object

class Number
{
	//Singleton Object
	private static Number x = new Number();
	
	private Number()
	{
		System.out.println("Kya Likhu");
	}
	
	//Factory Method
	public static Number getObject()
	{
		return x;
	}
	
}

class Singleton2
{
	public static void main(String args[])
	{
			Number n = Number.getObject();
			
	}
}