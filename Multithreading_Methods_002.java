//setPriority method.
//getPriority

/*
    MIN-PRIORITY = 1
    NORM_PRIORITY = 5
    MAX_PRIORITY = 10

    Priority will be set in intNUmber
    Priority level will be set to 1 - 10, in int Number
    1 denoting least priority, 10 denoting highest priority
 */


//Main Class
public class Multithreading_Methods_002
{
    public static void main(String[] args)
    {
        A aa = new A();
        B bb = new B();
        C cc = new C();

        cc.setPriority(Thread.MAX_PRIORITY);

        bb.setPriority(aa.getPriority() + 1);

        aa.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread A Started....");
        aa.start();

        System.out.println("Thread B Started....");
        bb.start();

        System.out.println("Thread C Started....");
        cc.start();


        System.out.println("Main thread Ended");
    }
}


//Thread A Class
class A extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread A is Started");

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("From thread a : i = " + i);
        }
        System.out.println("Thread A ends here");
    }
}

//Thread B Class
class B extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread B Started");

        for(int j = 1; j <= 5; j++)
        {
            System.out.println("From thread b : j = " + j);
        }
        System.out.println("Thread B ends here");
    }
}


//Thread C Class
class C extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread C is Started");

        for(int k = 1; k <= 5; k++)
        {
            System.out.println("From thread c : k = " + k);
        }
        System.out.println("Thread C ends here");
    }
}