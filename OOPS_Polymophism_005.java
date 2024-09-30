// OOPS Polymorphism 

interface Animal
{
	void makeSound();
}

interface Pet extends Animal
{
	void play();
}

class Dog implements Pet
{
	public void makeSound()
	{
		System.out.println("Woof");
	}
	
	public void play()
	{
		System.out.println("Dog is Playing");
	}
} 

// Main
class PolySound4
{
	public static void main(String args[])
	{
		Dog k = new Dog();
		k.play();
		k.makeSound();
	}
}