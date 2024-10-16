interface A         //1st Interface
{
    public void run();
}


interface B         //2nd Interface
{
    public void run();
}


class C implements A, B
{
    public void run()
    {
        System.out.println("C class Run Method");
    }
}


//Main Class
public class OOPS_Abstraction_Interface_003
{
    public static void main(String[] args)
    {
        C obj = new C();
        obj.run();
    }
}
