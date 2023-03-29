import java.util.List;

public class Toping {
    String [] top= new String[]{"yogurt", "caramel", "honey", "ice-cream", "cream"};
    double weight = 100;
    double kkal = 200;
    public Toping()
    {

    }
    public void add()
    {
        System.out.println("is added");
    }
    public double weightX2()
    {
        return weight *= 2;
    }

    public double kkalX2()
    {
        return kkal *= 2;
    }

}
