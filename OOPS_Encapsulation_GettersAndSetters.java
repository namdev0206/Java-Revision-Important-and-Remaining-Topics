public class OOPS_Encapsulation_GettersAndSetters
{
    public static void main(String[] args)
    {
        ReadAndWrite rw = new ReadAndWrite();
        rw.setName("Nikhil22");
        System.out.println(rw.getName());

        Readonly ro = new Readonly();
        System.out.println(ro.getName());

        Writeonly wo = new Writeonly();
        wo.setAge(36);
    }
}



//Readonly
class Readonly
{
    private int age;
    private String name;


    Readonly()
    {
        this.age = 36;
        this.name = "Nikhil Panchal";
    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }
}


//Writeonly
class Writeonly
{
    private int age;
    private String name;


    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}



//Read and Write Class
class ReadAndWrite
{
    private int age;
    private String name;

    ReadAndWrite()
    {
        this.age = 1;
        this.name = "Nikhil";
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
}