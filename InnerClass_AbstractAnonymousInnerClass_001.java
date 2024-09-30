//Inner Class - Abstract Anonymous

abstract class Anonymous
{
	abstract void display();
}

//Main
public class OuterPrc4
{
	public static void main(String args[])
	{
		Anonymous ano = new Anonymous()
		{
			void display()
			{
				System.out.println("Inside Anonymous Inner Class");
			}
		};
		
		ano.display();
	}
}