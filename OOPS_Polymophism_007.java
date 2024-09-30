//OOPS Polymorphism 

interface Greeting
{
	void sayHello();
}

class World implements Greeting
{
	public void sayHello()
	{
		System.out.println("Hello World!");
	}
}

class PolyGreeting
{
	public static void main(String args[])
	{
		//Arrow Method to call a Function/Method
		//Greeting greeting = () -> System.out.println("Hello World!");
		
		World k = new World();
		k.sayHello();
	}
}