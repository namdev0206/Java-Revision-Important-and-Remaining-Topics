/*
Abstract Rules
1 - We should declare a class abstract if we're creating a Abstract method in a Class.
2 - We can't Create an object for an Abstract Class or Method.
3 - We should extend/implements the abstract class to Run.
4 - We should declare a body in child class of an Abstract Class.
*/

abstract class A
{
	abstract void add();
}

class Main extends A
{
	public void add()
	{
		System.out.println("Abstract Rule");
	}
}

//Main
class Abstract2
{
	public static void main(String args[])
	{
		//Define the Object for Main Class
		Main k = new Main();
		
		k.add();
	}
}