public class ExceptionHandling_004_ThrowsKeyword
{
    public static void main(String[] args)
    {
        int a[] = new int[5];

        try
        {
            getNumberFromArray(a);
        }
        catch (Exception e)
        {
            System.out.println("Catch the Exception " + e.getMessage());
        }
    }


    //Throws Keyword
    static int getNumberFromArray(int a[]) throws ArithmeticException
    {
        return a[8];
    }
}
