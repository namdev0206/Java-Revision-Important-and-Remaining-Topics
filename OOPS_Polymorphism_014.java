
class Data          //Parent Class
{
    int data;

    public void printData()
    {
        System.out.println(data);
    }


    //Compile-time Polymorphism
    public void printData(int times)
    {
        for(int i = 0; i < times; i++)
        {
            System.out.println(data);
        }
    }
}


class ChildData extends Data            //Child Class
{
    //Run-time Polymorphism
    @Override
    public void printData()
    {
        System.out.println("Overridden : " + data);
    }
}


//Main Class
public class OOPS_Polymorphism_014
{
    public static void main(String[] args)
    {
        Data d;
        d = new ChildData();
        d.printData();              //Run-time Polymorphism aka Method Overriding

        Data d2 = new Data();
        d2.printData(5);     //Compile-time Polymorphism aka Method Overloading
    }
}
