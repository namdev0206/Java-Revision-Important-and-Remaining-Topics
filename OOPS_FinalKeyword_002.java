//Final Method

//Parent Class
class Demo
{
    //Final method -- To prevent from Overriding
    final void m1()
    {
        System.out.println("I am in demo Class -- Parent Class");
    }
}



//Child Class
public class OOPS_FinalKeyword_002 extends Demo
{
    /*
    //Overridden Method is Final
    void m1()
    {
        System.out.println("I am in demo Class --- Child Class");
    }
    */

    public static void main(String[] args)
    {
        OOPS_FinalKeyword_002 obj = new OOPS_FinalKeyword_002();
        obj.m1();
    }
}