public class OOPS_Inheritance_003_MethodOverriding_Ex2_Car extends OOPS_Inheritance_003_MethodOverriding_Ex2_Vehicle
{
    void start()
    {
        System.out.println("Car is Starting");
    }


    public static void main(String[] args)
    {
        OOPS_Inheritance_003_MethodOverriding_Ex2_Car obj = new OOPS_Inheritance_003_MethodOverriding_Ex2_Car();

        obj.wheelsCount = 4;
        obj.model = "i10";
        obj.start();
    }
}