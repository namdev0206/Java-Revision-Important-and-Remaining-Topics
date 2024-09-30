// OOPS - Multi-Level Inheritance

import java.util.*;

class Emp
{
	int a;
	
	void setData(int m)
	{
		a = m;
	}
}

class Emp2 extends Emp
{
	int b;
	
	void setData1(int n)
	{
		b = n;
	}
} 

class Emp3 extends Emp2
{
	int c;
	
	void sum()
	{
		c = a+b;
		System.out.println("Sum of a + b is " + c);
	}
} 

//Main
class MLInher
{
	public static void main(String args[])
	{
		//Define Object for 3rd Class
		Emp3 k = new Emp3();
		k.setData(100);
		k.setData1(50);
		k.sum();
	}	
}