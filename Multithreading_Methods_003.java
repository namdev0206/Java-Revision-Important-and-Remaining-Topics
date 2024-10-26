//Thread Priority
//Thread ID

public class Multithreading_Methods_003
{
    public static void main(String[] args)
    {
        A aa = new A();
        B bb = new B();
        C cc = new C();

        aa.setPriority(Thread.MIN_PRIORITY);        //1 Priority
        bb.setPriority(Thread.NORM_PRIORITY);       //5 Priority
        cc.setPriority(Thread.MAX_PRIORITY);        //10 Priority

        System.out.println("\n Inside Main Threads and its ID is : " + Thread.currentThread().getId() );
        System.out.println("Main thread priority = " + Thread.currentThread().getPriority());

        System.out.println("\n Now calling other threads : Thread A -> Thread B -> Thread C");

        aa.start();
        bb.start();
        cc.start();
    }
}


//Thread Class A
class A extends Thread
{
    @Override
    public void run()
    {
        System.out.println("\n Inside Thread A :  \n Thread ID : \t" + Thread.currentThread().getId());
        System.out.println("Thread Priority : \t" + Thread.currentThread().getPriority());
    }
}


//Thread Class A
class B extends Thread
{
    @Override
    public void run()
    {
        System.out.println("\n Inside Thread B :  \n Thread ID : \t" + Thread.currentThread().getId());
        System.out.println("Thread Priority : \t" + Thread.currentThread().getPriority());
    }
}


//Thread Class A
class C extends Thread
{
    @Override
    public void run()
    {
        System.out.println("\n Inside Thread C :  \n Thread ID : \t" + Thread.currentThread().getId());
        System.out.println("Thread Priority : \t" + Thread.currentThread().getPriority());
    }
}