public class OOPS_Abstraction_FunctionalInterface_002
{

    /*    SuperInterface obj2 = new SuperInterface()
    {
    @Override
    public void interfaceMethod()
        {
        }
    };  */

    SuperInterface obj3 = () ->
    {

    };


    public static void main(String[] args)
    {
        Walkable walkable = (int steps) ->
        {
            System.out.println("Walked " + steps + " Steps");
            return steps;
        };

        Walkable obj2 = (int steps) -> 2*steps;


        walkable.walks(5);
    }
}


@FunctionalInterface
interface SuperInterface
{
    void interfaceMethod();
}

interface Walkable
{
    int walks(int steps);
}


class OuterClass
{
    public void outerMethod()
    {

    }
}