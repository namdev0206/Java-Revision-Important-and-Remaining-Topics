//Overriding - Run-time Polymorphism

class Person
{
    public void showDetails()
    {
        System.out.println("Basic Detail of Person");
    }
}

class Employee extends Person
{
    public void showDetails()
    {
        System.out.println("Showing the Detail of the Employee");
    }
}

class Ram
{
    public void doWork(Person person)
    {
        person.showDetails();
    }
}


//Main Class
public class OOPS_Polymorphism_013_Overriding
{
    public static void main(String[] args)
    {
        //Person person = new Person();
        //person.showDetails();

        Person person = new Employee();
        person.showDetails();

        Ram ram = new Ram();
        ram.doWork(person);
    }
}