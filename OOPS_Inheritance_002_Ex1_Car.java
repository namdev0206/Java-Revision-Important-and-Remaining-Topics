public class OOPS_Inheritance_002_Ex1_Car extends OOPS_Inheritance_002_Ex1_Vehicle
{
    public static void main(String[] args)
    {
        OOPS_Inheritance_002_Ex1_Car obj = new OOPS_Inheritance_002_Ex1_Car();

        obj.wheelsCount = 4;
        obj.model = "i10";
        obj.start();
    }
}