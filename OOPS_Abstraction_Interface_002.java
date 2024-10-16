//Interface
interface Car
{
    public void start();
}


//1st Inheritance
class ElectricCar implements Car
{
    public void start()
    {
        System.out.println("Electric car starts.");
    }
}


//2nd Inheritance
class DieselCar implements Car
{
    public void start()
    {
        System.out.println("Diesel car Starts.");
    }
}


//Main Class
public class OOPS_Abstraction_Interface_002
{
    public static void main(String[] args)
    {
        Car tesla = new ElectricCar();
        Car xuv700 = new DieselCar();

        tesla.start();
        xuv700.start();
    }
}
