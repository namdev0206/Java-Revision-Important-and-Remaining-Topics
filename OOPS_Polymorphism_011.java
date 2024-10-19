class A
{
	int a;

	public A()
	{
		System.out.println("Class A ");
	}
}

class B extends A
{
	int a;

	public B()
	{
		System.out.println("Class B ");
	}
}

class C extends B
{
	int a;

	public C()
	{
		System.out.println("Class C ");
	}
}

//Main
class PolyQue
{
	public static void main(String args[])
	{
		C k = new C();
		//k.display();
	}
}