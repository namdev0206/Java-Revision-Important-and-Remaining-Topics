//STOP()
//SLEEP()
//YEILD()

public class Multithreading_Methods_001
{
    public static void main(String[] args)
    {
       A thread1 = new A();
       B thread2 = new B();
       C thread3 = new C();

       System.out.println("Thread A is being started....");
       thread1.start();

       System.out.println("Thread A is being started....");
       thread2.start();

       System.out.println("Thread A is being started....");
       thread3.start();
    }
}


//Thread 1
class A extends Thread
{
    @Override
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            if(i == 1)
            {
                //From running to runnable state
                //It will stop running to execute the another threads
                yield();
                System.out.println("\n From thread A: i = " + i);
            }
        }
    }
}


//Thrread 2
class B extends Thread
{
    @Override
    public void run()
    {
        for(int j = 1; j <= 5; j++)
        {
            System.out.println("\n From thread B: j = " + j);
            if(j == 3)
            {
                //This will kill the thread -- And it will stop working
                stop();
            }
        }
    }
}


//Thread 3
class C extends Thread
{
    @Override
    public void run()
    {
        for(int k = 1; k <= 5; k++)
        {
            System.out.println("\n From thread C: k = " + k);
            if(k == 1)
            {
                try
                {
                    //The timing will be in milliseconds -- 1 second = 1000 milliseconds
                    //This will sleep the thread
                    sleep(1000);
                }
                catch(Exception e)
                {

                }
            }
        }
        System.out.println("End of thread C");
    }
}