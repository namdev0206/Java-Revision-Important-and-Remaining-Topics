// OOPS Polymorphism 

interface Animal
{
	void makeSound();
}

class Dog implements Animal
{
	public void makeSound()
	{
		System.out.println("Woof");
	}
} 

// Main
class PolySound
{
	public static void main(String args[])
	{
		Dog k = new Dog();
		k.makeSound();
	}
}