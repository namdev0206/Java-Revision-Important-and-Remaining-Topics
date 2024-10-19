import java.util.Objects;

class Car
{
    String model;
    int year;


    public Car(String model, int year)
    {
        this.model = model;
        this.year = year;
    }


    //Already provided by JDK or IntelliJ
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
    //Already provided by JDK or IntelliJ


    /*
    @Override
    public String toString()
    {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int hashCode()
    {
        int initialNumber = 31;
        initialNumber += year;
        initialNumber += model.hashCode();
        return initialNumber;
    }


    public boolean equals(Object obj)
    {
        Car that = (Car)obj;
        if(this.model.equals(that.model)  &&  this.year == that.year)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        return "Car's Model is : " + model + " and Year is : " + year;
    }
*/
}


public class OOPS_ObjectClass_001
{
    public static void main(String[] args)
    {
        Car obj1 = new Car("Honda", 2022);
        //System.out.println(obj.toString());
        System.out.println(obj1.hashCode());

        Car obj2 = new Car("Honda", 2021);
        System.out.println(obj2.hashCode());


        System.out.println(obj1.equals(obj2));

    }
}
