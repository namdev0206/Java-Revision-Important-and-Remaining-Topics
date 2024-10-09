//Access Modifiers / Specifiers

//Parent Class - 1
class Person
{
    int age;
    String name;
}


//Parent Class - 1
class Teacher
{
    //Public Access
    public static int teachingClass;

    //Private Access
    private static int id;


    //Default or Package Private -- Only Accessible in the Same Package
    String Degree;

    public static void main(String[] args)
    {
        //Teacher obj1. = new Teacher();

        teachingClass = 12;
        id = 00012;
    }
}



//Main Class
public class OOPS_AccessModifiers_001 extends Teacher
{
    public static void main(String[] args)
    {
        Teacher obj = new Teacher();
        obj.teachingClass = 12;

        //Can't be Accesss the ID of teacher --- Because It is private in Teacher Class
        //obj.id = 0023;
    }
}
