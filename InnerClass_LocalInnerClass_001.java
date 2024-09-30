//Non-Static - Inner Class - 1. Local Inner Class

class OuterClass
{
	private int data=100;
	
	void sum()
	{
		class InnerClass
		{
			int r=10;
			void readData()
			{
				data = data + 10;
				r = r + 10;
				System.out.println("value of Data "+data);
			}
		}
		InnerClass ob1=new InnerClass();
		ob1.readData();
	}
}


class LocalIC 
{
	public static void main(String args[])
	{
		OuterClass ob=new OuterClass();
		ob.sum();
	}
}