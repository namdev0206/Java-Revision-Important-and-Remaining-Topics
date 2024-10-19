// OOPS (Polymorphism -- Method Overloading)
//Number of Arguments are same then Datatype must be Changed

class Emp
{
	//Method Overloading
	void add(int a, int b)
	{
		int c = a + b;
		System.out.println("Value of C = " + c);
	}
	
	//Function - Method with Same name but different arguments
	void add(int a, double b)
	{
		double d = a * b;
		
		System.out.println("Value of D = " + d);
	}
}

// Main Polymorphism - Method Overloading
class Polymor2
{
	public static void main(String args[])
	{
		Emp k = new Emp();
		k.add(10, 20);
		k.add(3, 2.5);
	}
}