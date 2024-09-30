// Abstract,Interface - Implements & Extends
// From Class to class we use extends

interface A
{
	//Abstract - A Method or Function with No body.
	void add();
}


// From interface to interface we use extends
interface B extends A
{
	//Abstract - A Method or Function with No body.
	void sum();
}


// From interface to class we use implements
class C implements B
{
	//public is compulsory to make a function from interface 
	public void add()
	{
		System.out.println("Add");
	}
	
	//public is compulsory to make a function from interface 
	public void sum()
	{
		System.out.println("Sum");
	}
}

//Main
class Interface
{
	public static void main(String args[])
	{
		C k = new C();
		
		k.add();
		k.sum();
	}
}