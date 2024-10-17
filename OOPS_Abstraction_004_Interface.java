//In INTERFACE the methods are by default ABSTRACT

public class OOPS_Abstraction_004_Interface
{
    public static void main(String[] args)
    {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
        monkey.drinks();

        System.out.println(Animal.LEGS);
    }
}


//Interface - 2
interface Pet
{
    void sings();

    void drinks();
}


//Interface - 1
interface Animal
{
    //This is by DEFAULT is public sttic final
    //public static final int LEGS = 4;
    int LEGS = 4;

    void eats();

    void drinks();


    //Default method in Interface -- To prevent from change from Every class
    //That implements this class
    default void walk()
    {
        System.out.println("For future Reference \n Animal is Walking");
    }
}


//Class id Implementing Interfaces
class Monkey implements Animal, Pet
{
    //Inteface Animal
    @Override
    public void eats()
    {
        System.out.println("Monkey is Eating");
    }

    //Interface Pet
    @Override
    public void sings() {
        System.out.println("Monkey is Singing");
    }

    //Interface Animal and Pet Both
    @Override
    public void drinks() {
        System.out.println("Monkey is Drinking");
    }
}