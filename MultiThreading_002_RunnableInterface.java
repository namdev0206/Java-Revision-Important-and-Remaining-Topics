//Can not directly run the start method in Runnable Interface

public class MultiThreading_002_RunnableInterface
{
    public static void main(String[] args)
    {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}


//Thread 1
class MyThreadRunnable1 implements Runnable
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("I am a Thread 1. Not a threat 1");
        }
    }
}

//Thread 2
class MyThreadRunnable2 implements Runnable
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("I am a Thread 2. Not a threat 2");
        }
    }
}