//Functional Interface can contain only 1 Abstract method
//Functional Interface can contain 1 or multiple Default Method

@FunctionalInterface
interface I
{
    //Only one abstract method
    public abstract void m1();



    //1 or more Default Methods
    public default void m2()
    {
        System.out.println("m2 default-I");
    }

    public default void m3()
    {
        System.out.println("m3 default-I");
    }



    //Static Methods
    public static void m4()
    {
        System.out.println("1 Static Method");
    }

    public static void m5()
    {
        System.out.println("2 Static Method");
    }
}


public class OOPS_Abstraction_FunctionalInterface_001 implements I
{
    public void m1()
    {
        System.out.println("m1 from OOPS_Abstraction_FunctionalInterface class");
    }


    public static void main(String[] args)
    {
        I.m4();
        I.m5();
        I obj = new OOPS_Abstraction_FunctionalInterface_001();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
