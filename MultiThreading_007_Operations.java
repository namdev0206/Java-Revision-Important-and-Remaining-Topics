class UserThread extends Thread
{
    public void run()
    {
        //Task for Thread....
        System.out.println("This is User Defined Thread");
    }
}



//Main Class
public class MultiThreading_007_Operations
{
    public static void main(String[] args)
    {
        System.out.println("Program Strated\n");


        int x = 56 + 32;
        System.out.println("Sum is : " + x);


        //Found name of Thread....
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current running Thread is : " + tname);

        //Set name of Thread...
        t.setName("MyMain");
        System.out.println("New Name of Thread is : " + t.getName());

        //Sleep of a Thread for Some time
        try
        {
            Thread.sleep(5000);
        }catch(Exception e)
        {}

        //Get ID of Thread
        System.out.println(t.getId());


        //User Defined Thread
        UserThread t1 = new UserThread();
        t1.start();

        System.out.println("\nProgram Ended");
    }
}
