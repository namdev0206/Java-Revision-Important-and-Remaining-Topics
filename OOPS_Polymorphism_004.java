// OOPS Polymorphism 

interface Animal
{
	void makeSound();
	
	//We can Create Body of a Method in Interface Using Default
	default void eat()
	{
		System.out.println("This animal is Eating");
	}
}

class Cat implements Animal
{
	public void makeSound()
	{
		System.out.println("Woof");
	}
} 

// Main
class PolySound2
{
	public static void main(String args[])
	{
		Cat k = new Cat();
		k.eat();
		k.makeSound();
	}
}