//Private Constructor
//Singleton Object
 
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
	
	public double pi()
	{
		return 3.14;
	}
}

//Main
class SingletonTest
{
	public static void main(String args[])
	{
		Number n = Number.getObject();
		System.out.println(n.pi());
	}
}