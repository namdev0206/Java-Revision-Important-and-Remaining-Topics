//String Handling - Concatinate Function
/*
Literal Keyword 
{
	String name = "Sahil";	
}

//New Keyword
{
	String name = new String(name);
}
*/

class StringHandling
{
	public static void main(String args[])
	{
		String name = "sahil";
		String name1 = "sahil";
		String name2 = "sahil";
		String name3 = "Sahil";
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		//Concatinate Function
		name = name.concat(" Kumar");
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
	}
}