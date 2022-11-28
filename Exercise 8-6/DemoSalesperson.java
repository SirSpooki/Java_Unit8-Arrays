public class DemoSalesperson
{
   public static void main (String args[])
   {
      Salesperson[] people = new Salesperson[10];

      for(int x = 0; x < 10; ++x)
        {
            people[x] = new Salesperson(9999, 0);
        }
   }
}


