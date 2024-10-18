//---->   Methods to call Interface   <----
//1st Method -- Create Saperate class and Implements this Interface
//2nd Method -- Anonymous class for Implementing interface
//3rd Method -- Lambda expression

package OOPS_LambdaExpression_Interface_package;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("My System starts....");

        //1st method to Call an Interface  -- MyInter.java
        //MyInter myInter = new MyInterImpl();
        //myInter.sayHello();



        //2nd Method -- Anonymous Class  -- MyInter.java
/*      MyInter i = new MyInter()
        {
            @Override
            public void sayHello()
            {
                System.out.println("This is First Anonymous Class.");
            }
        };
        i.sayHello();

        MyInter i2 = new MyInter()
        {
            @Override
            public void sayHello()
            {
                System.out.println("My Second Anonymous Class.");
            }
        };
        i2.sayHello();      */



        //3rd Method -- Lambda Expression  -- MyInter.java
        //Using our interface with the help of Lambda
/*      MyInter i = () ->  System.out.println("This is 1st Lambda Expression.");
        i.sayHello();

        MyInter i2 = () -> System.out.println("This is 2nd Lambda Expression.");
        i2.sayHello();      */


        //3rd Method -- Lambda Expression  -- SumInter.java
        //Using our interface with the help of Lambda
/*      SumInter sumInter = (int a, int b) ->
        {
            return a+b;
        };      */

        SumInter sumInter = (a, b) ->   a+b;
        System.out.println("1st : " + sumInter.sum(10, 20));
        System.out.println("2nd : " + sumInter.sum(5, 6));




        //3rd Method -- Lambda Expression  -- LengthInter.java
        //Using our interface with the help of Lambda
        LengthInter lengthInter = (str -> str.length());
        System.out.println("Length of the String is " + lengthInter.getLength("Nikhil Panchal"));
    }
}