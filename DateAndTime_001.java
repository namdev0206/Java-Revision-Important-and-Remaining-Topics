public class DateAndTime_001
{
    public static void main(String[] args)
    {
        //System.currentTimeMillis is a function which will shows you the current time in Milliseconds
        //And this will change every time you'll refresh it


        //This will show you the <-- Millis --> are gone since 1970
        System.out.println("No. of Millis Since 1 Jan 1970 - " + System.currentTimeMillis());


        //To know the <-- Seconds --> are gone since 1970, 1st January
        System.out.println("No. of Seconds Since 1 Jan 1970 - " + System.currentTimeMillis()/1000);


        //To know the <-- Minutes --> are gone since 1970, 1st January
        System.out.println("No. of Minutes Since 1 Jan 1970 - " + System.currentTimeMillis()/1000/3600);


        //To know the <-- Days --> are gone since 1970, 1st January
        System.out.println("No. of Days Since 1 Jan 1970 - " + System.currentTimeMillis()/1000/3600/24);


        //To know the <-- Years --> are gone since 1970, 1st January
        //If we're assuming that the year has 365 Daya
        System.out.println("No. of Years Since 1 Jan 1970 - " + System.currentTimeMillis()/1000/3600/24/365);
    }
}
