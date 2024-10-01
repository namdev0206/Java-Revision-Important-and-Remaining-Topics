import java.util.*;

public class DateAndTime_GregoreanCalendarClass_004
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        //To print the only DATE according to the Calendar
        System.out.println(c.get(Calendar.DATE));

        //To print the only SECONDS according to the Calendar
        System.out.println(c.get(Calendar.SECOND));

        //To print the only HOUR according to the Calendar
        System.out.println(c.get(Calendar.HOUR));

        //To print the only 24-HOUR-FORMAT according to the Calendar
        System.out.println(c.get(Calendar.HOUR_OF_DAY));


        //To print the Time with Hours, Minutes and Seconds
        System.out.println((c.get(Calendar.HOUR_OF_DAY)) + ":" + (c.get(Calendar.MINUTE)) + ":" + (c.get(Calendar.SECOND)));


        //To check if a Year is a leap year
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));


        //To check the Universal Time zone from their IDs
        //Every TimeZone have its Different ID -- We cal access it by ID of the Time Zone
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
