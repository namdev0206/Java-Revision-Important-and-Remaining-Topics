//Setter and Getter

package encapsulation.learnEncapsulation;                             //Package

import encapsulation.learnPackage.OOPS_Encapsulation_001_Person;      //Import

public class OOPS_Encapsulation_001
{
    public static void main(String[] args)
    {
        OOPS_Encapsulation_001_Person p1 = new OOPS_Encapsulation_001_Person();

        //Can not be Access Directly. And Can't even print from that private Modifiers
        //p1.age = 12;
        //System.out.println(p1.age);


        //That's why we use Setter and Getter
        p1.setAge(12);

        if(p1.canBeAccessed == true)
        {
            System.out.println(p1.getAge());
        }
        else
        {
            System.out.println("You are not accessible to change or modify the Age.");
        }
    }
}
