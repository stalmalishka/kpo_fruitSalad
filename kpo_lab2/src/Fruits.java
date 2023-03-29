public class Fruits {
    String name;
    double weight;
    double kkal;
    String sort;
    String country;

    public Fruits()
    {

    }

    public void add()
    {
        System.out.println("is added");
    }

    public void cut()
    {
        System.out.println("is cut");
    }

    public void peel()
    {
        System.out.println("is peeled");
    }

    public double weightX2()
    {
        return weight *= 2;
    }

    public double kkalX2()
    {
        return kkal *= 2;
    }

    public double weightX3()
    {
        return weight *= 3;
    }

    public double kkalX3()
    {
        return kkal *= 3;
    }


}
