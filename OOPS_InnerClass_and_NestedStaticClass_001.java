public class OOPS_InnerClass_and_NestedStaticClass_001
{
    class Toy
    {
        int price1;
    }


    static class PlayStation
    {
        static int price2;
    }

    public static void main(String[] args)
    {
        OOPS_InnerClass_and_NestedStaticClass_001 obj = new OOPS_InnerClass_and_NestedStaticClass_001();
        Toy toy = obj.new Toy();
        toy.price1 = 45;

        PlayStation playstation = new OOPS_InnerClass_and_NestedStaticClass_001.PlayStation();
        PlayStation.price2 = 45000;
    }
}
