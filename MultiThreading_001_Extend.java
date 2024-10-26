//Main Class
public class MultiThreading_001_Extend
{
    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}


//Thread 1
class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;

        while(i < 40000)
        {
            System.out.println("My Cooking thread is Running");
            System.out.println("I am happy");

            i++;
        }
    }
}


//Thread 2
class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;

        while(i < 40000)
        {
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad");

            i++;
        }
    }
}