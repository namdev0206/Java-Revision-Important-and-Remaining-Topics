//Creating thread using Thrad Class
class MyAnotherThread extends Thread
{
    public void run()
    {
        //task for Thread....
        for(int i = 10; i >= 1; i--)
        {
            System.out.println("Another Thread = " + i);

            //Sleeping of a thrad for some time
            try
            {
                Thread.sleep(1500);
            }
            catch (Exception e)
            {}
        }
    }
}


public class MultiThreading_006
{
    public static void main(String[] args)
    {
        MyAnotherThread t1 = new MyAnotherThread();
        t1.start();
    }
}
