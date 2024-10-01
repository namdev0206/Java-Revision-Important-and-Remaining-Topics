//Latest Time and Date Class Used in Java 8

import java.time.*;

public class DateAndTime_JavaTimePackage_005
{
    public static void main(String[] args)
    {
        //To print the Local Date
        LocalDate d = LocalDate.now();
        System.out.println(d);

        //To print the Local Time
        LocalTime t = LocalTime.now();
        System.out.println(t);


        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}