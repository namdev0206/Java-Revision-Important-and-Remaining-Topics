//Try Catch Finally Block

public class ExceptionHandling_003_TryCatch_FinallyBlock
{
    public static void main(String[] args)
    {
        int a[] = new int[5];

        System.out.println("Hello World!");

//        try
//        {
//            System.out.println(a[3]);
//        }
//        catch (Exception e)
//        {
//            System.out.println("Exception Handles");
//        }
//        finally
//        {
//            System.out.println("I will run Always.");
//        }

        try
        {
            System.out.println(a[3]);
        }
        finally             //Finally block will be Execute only for One time.
        {                   //And it will be aplly in the Last
            System.out.println("I will run Always.");
        }


        System.out.println("Bye World!");
    }
}
