//Fully Qualified
package lib;
inport java.util.*;

//Should save PackageFQ2.java in (lib2>namdev Name Folder)

//Class
public class PackageFQ2
{
	public void calculator()
	{
		Scanner input = new Scanner(System.in);
		
		int a, b;
		char sym;
		
		//Input for A Value
		System.out.println("Enter the First Number ");
		a = input.nextInt();
		
		//Input for B Value
		System.out.println("Enter the First Number ");
		b = input.nextInt();
		
		//Input for Character Value
		System.out.println("Choose the Sign\n1. "+"\n2. "-"\n3. "*"\n4. "/"");
		sym = input.next();
		
		//Calculator Equation
		switch(sym)
		{
			Case "+":
			{
				System.out.println("A + B = " + (a+b));
			}
			break;
			
			case "-":
			{
				System.out.println("A - B = " + (a-b));
			}
			break;
			
			case "*":
			{
				System.out.println("A x B = " + (a*b));
			}
			break;
			
			case "/":
			{
				System.out.println("A / B = " + (a/b));
			}
			break;
		}
	}
}

