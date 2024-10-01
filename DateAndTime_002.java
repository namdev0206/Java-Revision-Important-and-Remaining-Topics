//Date class Methods in java.

import java.util.*;

public class DateAndTime_002
{
    public static void main(String[] args)
    {
        //Is it safe to store the Millis in long Variable?
        //System.out.println(Long.MAX_VALUE);
        //System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);

        //Returns the number of MilliSeconds since 1 Jan 1970
        System.out.println(d.getTime());

        //Returns the Date
        System.out.println(d.getDate());

        //Returns the Seconds in current time
        System.out.println(d.getSeconds());

        //Returns the Year
        System.out.println((d.getYear() + 1900));
    }
}
