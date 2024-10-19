//Overloading - Compile Time Overloading
class Student
{
    public void read()
    {
        System.out.println("Student is Reading XYZ Book");
    }


    public void read(String bookName)
    {
        System.out.println("Student is Reading : " + bookName + " Book");
    }
}




public class OOPS_Polymorphism_013_Overloading
{
    public static void main(String[] args)
    {
        System.out.println("This is Just Testing.");


        Student student = new Student();
        student.read("Nikhil's");
    }
}