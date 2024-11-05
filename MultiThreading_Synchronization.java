//Synchronized Keyword class
class Company
{
    int n;

    //Synchronized
    //When a thread is working then other thread or method will not Interrupt
    synchronized public void produce_item(int n)
    {
        this.n = n;
        System.out.println("Produced : " + this.n);
    }

    //Synchronized
    //When a thread is working then other thread or method will not Interrupt
    synchronized public int consume_item()
    {
        System.out.println("Consumed : " + this.n);
        return this.n;
    }
}


//Thread Producer Class
class Producer extends Thread
{
    Company c;

    public Producer(Company c)
    {
        this.c = c;
    }

    @Override
    public void run()
    {
        int i = 1;

        while(true)
        {
            this.c.produce_item(i);

            try
            {
                Thread.sleep(500);
            }catch(Exception e)
            {}

            i++;
        }
    }
}


//Thread Consumer Class
class Consumer extends Thread
{
    Company c;

    Consumer(Company c)
    {
        this.c = c;
    }

    public void run()
    {
        while(true)
        {
            this.c.consume_item();

            try
            {
                Thread.sleep(500);
            }catch(Exception e)
            {}
        }
    }
}



//Main Class
public class MultiThreading_Synchronization
{
    public static void main(String[] args)
    {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        p.start();
        c.start();
    }
}