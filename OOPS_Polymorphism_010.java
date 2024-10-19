//Polymorphism

class P1
{
	public void add(int a, int b)
	{
		int c  = a + b;
		System.out.println("Value of A + B = " + c);
	}
}

//Class P1 & P2 have same Method Name, and Same Arguments but Different Body

class P2 extends P1
{
	public void add(int a, int b)
	{
		int c  = a - b;
		System.out.println("Value of A - B = " + c);
	}
}

//Main
class Poly3
{
	public static void main(String args[])
	{
		P1 k;
		//Define the Object for Child Class
		k = new P2();
		//Call the Function for Child Class
		k.add(100,20);
		
		//Define the Object for Child Class
		k = new P1();
		//Define the Object for Child Class
		k.add(4,5);
	}
}