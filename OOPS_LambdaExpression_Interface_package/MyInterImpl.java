//---->   Methods to call Interface   <----
//1st Method -- Create Saperate class and Implements this Interface
//2nd Method -- Anonymous class for Implementing interface
//3rd Method -- Lambda expression


package OOPS_LambdaExpression_Interface_package;

public class MyInterImpl implements MyInter
{
    @Override
    public void sayHello()
    {
        System.out.println("I am saying hello from MyInter");
    }
}
