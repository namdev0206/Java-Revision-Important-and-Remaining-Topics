import java.util.*;

public class StringBuilder_001
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //Charactrer at Index 0
        //System.out.println(sb.charAt(0));

        //Set character at Index
        //sb.setCharAt(0, 'P');
        //System.out.println(sb);

        //Insert index in the String
        sb.insert(2, 'n');
        System.out.println(sb);
    }
}
