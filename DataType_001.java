class A1
{
	public void add(byte a)
	{
		System.out.prrintln("Byte");
	}
	
	public void add(short a)
	{
		System.out.prrintln("Short");
	}
	
	public void add(int a)
	{
		System.out.prrintln("Int");
	}
	
	public void add(long a)
	{
		System.out.prrintln("Long");
	}
	
	public void add(double a)
	{
		System.out.prrintln("Double");
	}
}

/*
Datatype Formula
-2^(size*8-1) to 2^(size*8-1)-1
*/

//Main
class Datatype
{
	public static void main(String args[])
	{
		byte a = 128;
		
		//Define an Object for a Class
		A1 k = new A1();
		//System.out.println(a);
		
		k.add(a);
	}
}