/*
Final Class - Rules
1 - Can not extends/implements the Final class.
2 - We can create the Object for Final Class.
*/

final class A
{
	int a, b, c;
	
	public void add(int a, int b)
	{
		c = a + b;
		System.out.println("Addition of A + B is " + c);
	}
}

/*
class B extends A
{
	public void add(int a, int b ,int c)
	{
		int d;
		
		{
			d = a * b * c;
			System.out.println("Value for a x b x c is" + d);
		}
	}
}
*/

// Main
class FinalClassRule
{
	public static void main(String Args[])
	{
		//Create or Define an Object for Final Class
		A k = new A();
		
		k.add(10, 20);
		//k.add(2, 4, 6);
	}
}