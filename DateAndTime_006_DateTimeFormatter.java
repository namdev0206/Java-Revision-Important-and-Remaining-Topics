/*
Link to get the Format type of Date and Time in Java 8
https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/time/format/DateTimeFormatter.html
*/


import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime_DateTimeFormatter_006
{
    public static void main(String[] args)
    {
        LocalDateTime dt = LocalDateTime.now();                             //This is the Date
        System.out.println(dt);


        //Choose the Date time Pattern as I want
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd | MM | yyyy -- E -- H:m K");   //This is the Format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(df);

        //Creating date String using Date and Formatter
        String myDate = dt.format(df);
        System.out.println(myDate);

        String myDate2 = dt.format(df2);
        System.out.println(myDate2);

    }
}