//Creating thread using Runnable Interface
class MyThread implements Runnable
{
    @Override
    public void run()
    {
        //Task for thread....
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Value of i is : " + i);

            //Sleeping of a thrad for some time
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {}
        }
    }
}


//Main Class
public class MultiThreading_005
{
    public static void main(String[] args)
    {
        //Create object of MyThread class
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);
        thr.start();
    }
}