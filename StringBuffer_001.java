//If the capacity of StringBuffer will be more than 16 then,
//  (16 * 2) + 2
//  (OLD CAPACITY + 1) * 2

import java.lang.*;

public class StringBuffer_001
{
    public static void main(String[] args)
    {
        //This object can Store 16 Characters
        StringBuffer sb = new StringBuffer("deepak");

        //sb.capacity will show you the capacity of the Object
        //System.out.println(sb.capacity());
        //System.out.println(sb.capacity());          //16 + String Length("Nikhil") = 22


        //StringBuffer sb1 = new StringBuffer(1000);
        //System.out.println(sb1.capacity());


        //Methods of StringBuffer class
        //sb.append("Hello");

        //sb.append(" deepak Nikhil");
        //System.out.println(sb.capacity());


        StringBuffer sb1 = new StringBuffer("Deepak");

        StringBuffer sb2 = new StringBuffer("Nikhil");
        //Will provide the Length
        //System.out.println(sb1.length());

        //Provide the Index of th Character
        //System.out.println(sb1.charAt(3));

        //Will Concat or join in the Last of String
        //System.out.println(sb1.append(" Hello"));

        //Will delete the characters of string
        //System.out.println(sb1.delete(2, 5));

        //Delete the charcter of this Index
        //System.out.println(sb.deleteCharAt(3));
    }
}
