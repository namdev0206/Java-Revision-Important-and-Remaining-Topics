// OOPS (Polymorphism -- Method Overloading)

class Emp
{
	//Method Overloading
	void add(int a, int b)
	{
		int c = a + b;
		System.out.println("Value of C = " + c);
	}
	
	//Function - Method with Same name but multiple word works
	void add(int a, int b , int c)
	{
		int d = a * b * c;
		
		System.out.println("Value of D = " + d);
	}
}

// Main Polymorphism - Method Overloading
class Polymor
{
	public static void main(String args[])
	{
		Emp k = new Emp();
		k.add(10, 20);
		k.add(1, 2, 3);
	}
}