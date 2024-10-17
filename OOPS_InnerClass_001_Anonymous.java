public class OOPS_InnerClass_001_Anonymous
{
    public static void main(String[] args)
    {

    }


    //class InnerClass extends OuterClass { }
    OuterClass obj = new OuterClass()
    {
        void sing()
        {

        }


        public void outerMethod()
        {

        }
    };


    SuperInterface obj2 = new SuperInterface()
    {

        @Override
        public void interfaceMethod() {

        }
    };
}


class OuterClass
{
    public void outerMethod
    {
        System.out.println("");
    }
}

interface SuperInterface
{
    void interfaceMethod();
}