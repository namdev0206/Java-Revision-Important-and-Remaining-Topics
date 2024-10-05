//Parent Class
class ParentClass
{
    int wheelsCount;

    String model;


    //Constructor
    ParentClass()
    {
        System.out.println("Creating a vehicle Instance");
    }


    ParentClass(int wheelsCount)
    {
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }


    void start()
    {
        System.out.println("Vehicle is Starting");
    }
}



//Child Class
public class OOPS_Inheritance_004_SuperKeyword extends ParentClass
{

    String color;

    void start()
    {
        super.start();  //Access of the Parent Class
        System.out.println(this);
        System.out.println(this.model + " Car is Starting");
    }


    OOPS_Inheritance_004_SuperKeyword()
    {
        super(2);
        System.out.println("Car is being created");
    }

    public static void main(String[] args)
    {
        OOPS_Inheritance_004_SuperKeyword obj = new OOPS_Inheritance_004_SuperKeyword();
        System.out.println(obj.wheelsCount);

        obj.wheelsCount = 4;
        obj.model = "i10";
        obj.color = "Red";
        obj.start();
        System.out.println(obj.wheelsCount);
    }
} 
