//Throw Keyword

import java.util.*;

public class ExceptionHandling_004_ThrowKeyword
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age : ");

        try {
            int age = sc.nextInt();
            if (age > 100)
            {
                //throw new MyException("My Error is this");
                throw new ArithmeticException("More than 100 not Allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}


class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}