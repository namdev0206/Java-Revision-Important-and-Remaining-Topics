// String Handling - "==", "equlas", "compareTo", "equalsIgnoreCase"
// Literal Keyword  -- String name = "Sahil";	
// New Keyword -- String name = new String(name);

class StringHandling2
{
	public static void main(String args[])
	{
		String name = "sahil";
		String name1 = "sahil";
		String name2 = "sahil";
		String name3 = new String("sahil");
		
		//String Handling -- "==" -- Used to Compare the Address
		System.out.println(name == name1);
		System.out.println(name == name2);
		System.out.println(name == name3);
		
		
		//String Handling -- "Equals" -- Used to compare the reference values and objects
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));
		
		//String Handling -- "equalsIgnoreCase" --To ignore the Small or Capital Letters
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		
		//String Handling -- "compareTo" -- to Compare the Values in ASCII Values
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareTo(name2));
		System.out.println(name2.compareTo(name));
	}
}