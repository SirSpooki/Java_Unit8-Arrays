public class Salesperson
{
    private int id;
    private double sales;

    public Salesperson(int num, double amt)
    {
        id = num;
        sales = amt;
    }

    public  void setId(int num)
    {
        id = num;
    }
    public  void setSales(double amt)
    {
        sales = amt;
    }
    public int getId()
    {
        return id;
    }
    public double getSales()
    {
        return sales;
    }
  
}



