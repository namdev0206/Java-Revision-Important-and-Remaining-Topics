//Mehod Overloading

public class MethodOverloading_001
{
    public static void main(String[] args)
    {
        Greet obj1 = new Greet();
        obj1.greetings();
        obj1.greetings("Nikhil", 3);
    }
}


class Greet
{
    void greetings()
    {
        System.out.println("Hello, Good Morning.");
    }

    void greetings(String name)
    {
        System.out.println("Hello " + name + ", Good Morning.");
    }

    void greetings(String name, int count)
    {
        for(int i = 0; i < count; i++)
        {
            System.out.println("Hello " + name + ", Good Morning.");
        }
    }
}