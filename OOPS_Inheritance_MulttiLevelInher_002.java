//Multiple Inheritance


//First Class
class Parent1
{
	int a, b, c;
	
	void sub()
	{
		c = a + b;
	}
}

//Second Class
interface Parent2
{
	void sub();
}

//Common Class
class Child extends Parent1  Child implements Parent2
{
	void display()
	{
		
		System.out.println("Addition of A + B is " + c);
	}
	void sub()
		{
			c = a - b;
			System.out.println("Substraction of A - B is " + c);
		}
		
}

// Main
class MulInheri
{
	public static void main(String args[])
	{
		Child k = new Child();
		k.display();
	}
}