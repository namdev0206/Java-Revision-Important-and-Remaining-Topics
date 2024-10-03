public class Constructors_001
{
    public static void main(String[] args)
    {
        Complex num1 = new Complex(2, 3);
        num1.print();
    }
}


class Complex
{
    //In this case, int a is a real part, int b is imaginary part
    int a, b;


/*
    //Default Constructor
    public Complex()
    {
        a = 0;
        b = 0;
    }
*/


    public Complex(int real, int imaginary)
    {
        a = real;
        b = imaginary;
    }

    void print()
    {
        System.out.println(a + " + " + b + "i");
    }
}