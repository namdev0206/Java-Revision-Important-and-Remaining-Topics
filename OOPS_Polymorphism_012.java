class A
{
	int a;

	public A(int a)
	{
		System.out.println("Class A " + a);
	}
}

class B extends A
{
	int a;

	public B(int a)
	{
		System.out.println("Class B " + a);
	}
}

class C extends B
{
	int a;

	public C(int a)
	{
		System.out.println("Class C " + a);
	}
}

//Main
class PolyQue2
{
	public static void main(String args[])
	{
		C k = new C(10);
		//k.display();
	}
}