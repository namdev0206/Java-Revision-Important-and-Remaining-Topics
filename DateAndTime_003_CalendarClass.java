//Calendar Class and its Methods

import java.util.Calendar;
import java.util.TimeZone;

public class DateAndTime_CalendarClass_003
{
    public static void main(String[] args)
    {
        /*
        Calendar c = Calendar.getInstance();

        //To get the Time zone.
        System.out.println(c.getTimeZone());
        */


        //Add the ID of the timezone
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        //To get the Time zone.
        System.out.println(c.getTimeZone());

        //To get the ID of the current time zone.
        System.out.println(c.getTimeZone().getID());

    }
}
