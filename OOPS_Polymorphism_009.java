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
		//By adding super.(method name in parents class) 
		//it will call 1st the parent method then the Child Method)
		super.add(a,b);
		
		int c  = a - b;
		System.out.println("Value of A - B = " + c);
	}
}

//Main
class Poly2
{
	public static void main(String args[])
	{
		//This will Call By Default the Method of Child Class
		P2 k = new P2();
		k.add(100,30);
	}
}