public class OOPS_AbstractKeyword_001_AbsractClass
{
    public static void main(String[] args)
    {
        //Can not create Object of an Abstract Class
        //Vehicle v1 = new Vehicle();

        Car c1 = new Car();
        c1.accelerate();
        c1.brakes(4);
        c1.honks();
    }
}


//Can not create Object of an Abstract class
abstract class Vehicle
{

    //Abstract Method cannot have a body
    abstract void accelerate();


    abstract int brakes(int wheels);


    void honks()
    {
        System.out.println("Vehicle Honks - Vehicle");
    }
}




//We can Extend th abstract class
class Car extends Vehicle
{
    @Override       //It is used to check the Method Exists in the Parent Class or Not
    void accelerate()
    {
        System.out.println("Car is Accelerating");
    }


    @Override       //It is used to check the Method Exists in the Parent Class or Not
    int brakes(int wheels)
    {
        System.out.println("Car brakes are Pushed");
        return wheels;
    }


    void honks()
    {
        System.out.println("Car Honks - Car");
    }
}



abstract class Human
{
    void speak()
    {

    }


    //If you have an 1 single abstract method in your class. Then you have to make this class as Abstrac Class
    abstract void eat();
}