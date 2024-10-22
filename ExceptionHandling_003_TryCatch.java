//Try-Catch Block

public class ExceptionHandling_003_TryCatch
{
    public static void main(String[] args)
    {
/*
        int a[] = new int[5];

        System.out.println(a[0]);
        System.out.println("Hello World!");

        try {
            int result = 5/0;

            System.out.println(a[8]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Tried to access the out of bound Element " + e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
*/

        //catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e)
        //catch(RuntimeException e)


        int a[] = new int[5];

        System.out.println(a[0]);
        System.out.println("Hello World!");

        try {
            int result = 5/0;

            System.out.println(a[8]);
        }
        catch(Exception e)
        {
            System.out.println("All Exceptions Handles");
        }

        System.out.println("Bye guys");
    }
}