//Setter and Getter

package encapsulation.learnPackage;

public class OOPS_Encapsulation_001_Person
{
    private int age;

    private String name;


    boolean canBeChanged = true;

    public void setAge(int age)
    {
        if(canBeChanged)
        {
            if(age > 0)
            {
                this.age = age;
            }
            else
            {
                System.out.println("Error! Please Enter the correct age.");
            }
        }
    }



    public boolean canBeAccessed = false;



    public int getAge()
    {
        if(canBeAccessed)
        {
            return age;
        }
        else
        {
            return -1;
        }
    }
}
