public class OOPS_StaticKeyword_001_Variable
{
    /*
    //Instance Variable
    int a = 10;

    //Static Variable
    static int b = 20;

    void m1()
    {
        //static int c = 30;  //Error due to non class variable
    }
     */





    public void printHello()
    {
        System.out.println("HELLO with Non-Static");
    }


    public static void printHello1()
    {
        System.out.println("HELLO with Static");
    }


    public static void main(String[] args)
    {
        //Non Static method printHello() can not be referenced from a static context
        //printHello();

        printHello1();
    }
}
