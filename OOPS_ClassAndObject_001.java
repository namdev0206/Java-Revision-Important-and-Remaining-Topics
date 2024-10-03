//We can crete multiple classes, but only 1 public class can be added
//Every class name should be in Camel case. And first letter should be Capital Letter.
//We can create Multiple Objects from 1 Class


public class ClassAndObject_001
{
    public static void main(String[] args)
    {
        //1st Object -- Create an object for the Dog class
        Dog d1 = new Dog();
        //1st Object -- To access the Class from Object reference Name
        d1.name = "Tommy";
        d1.bark();
        d1.walk();

        //2nd Object
        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.walk();


        //Object for Complex Class
        Complex num1 = new Complex();
        num1.a = 3;
        num1.b = 5;
        num1.print();
    }
}


class Complex
{
    //In this case, int a is a real part, int b is imaginary part
    int a, b;

    void print()
    {
        System.out.println(a + " + " + b + "i");
    }
}


//Dog Class
class Dog
{
    //Properties
    String name;
    int age;
    String Color;


    //We will create functions for the Behaviour of class
    //Behaviour
    void walk()
    {
        System.out.println(name + " is Walking.");
    }

    void bark()
    {
        System.out.println(name + " is Barking.");
    }
}


//Cat Class
class Cat
{

}