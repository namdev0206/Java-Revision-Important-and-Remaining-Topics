public class ThisKeyword_001
{
    public static void main(String[] args)
    {
        Complex num1 = new Complex(2, 4);
        num1.print();

        Complex num2 = new Complex(4, 1);
        num2.print();

        System.out.println("Adding two Numbers");
        Complex result = num1.add(num2);

        result.print();
    }
}


class Complex
{
    //In this case, int a is a real part, int b is imaginary part
    int a, b;

    public Complex(int a, int b)
    {
        this.a = a;
        this.b = b;
    }


    void print()
    {
        System.out.println(a + " + " + b + "i");
    }


    Complex add(Complex num2)
    {
        Complex newNum = new Complex(a + num2.a, b+num2.b);
        return newNum;
    }
}