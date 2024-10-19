// OOPS Polymorphism

interface Animal
{
	void makeSound();
	
	//Created a body in Interface using Static
	static void description()
	{
		System.out.println("Animals can make sound and Eat");
	}
}

class Bird implements Animal
{
	public void makeSound()
	{
		System.out.println("Tweet");
	}
} 

// Main
class PolySound3
{
	public static void main(String args[])
	{
		Bird k = new Bird();
		k.makeSound();
		
		//Static Value Called by Veriable or Class
		Animal.description();
	}
}