//Non-Static - Inner Class - 2.Method/Member Inner Class

class OuterClass
{
	private int data=100;
		 
	class InnerClass
	{
		int r = 10;
		
		void readData()
		{
			data = data + 10;
			r = r + 10;
			
			System.out.println("value of Data "+data);
		}
	}
			 
	void add()
	{
		InnerClass ob=new InnerClass();
		ob.readData();
	}
}


class MethodIC
{
	public static void main(String args[])
	{
		OuterClass ob=new OuterClass();
		ob.add();
	}
}