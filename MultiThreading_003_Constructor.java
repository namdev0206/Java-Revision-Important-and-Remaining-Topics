
//Thread(String name) - Constructor
class MyThr extends Thread
{
    public MyThr(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        int i = 34;
        System.out.println("Thank you");

        while(true)
        {
            //System.out.println("I am a MyThr Thread, with Thread(String name)   - constructor");
        }
    }
}



public class MultiThreading_003_Constructor
{
    public static void main(String[] args)
    {
        MyThr t1 = new MyThr("Nikhil");
        MyThr t2 = new MyThr("Ram");

        t1.start();
        t2.start();

        System.out.println("The ID of the Thread 1 is " + t1.getId());
        System.out.println("The Name of the Thread 1 is " + t1.getName());

        System.out.println("\nThe ID of the Thread 2 is " + t2.getId());
        System.out.println("The Name of the Thread 2 is " + t2.getName());
    }
}