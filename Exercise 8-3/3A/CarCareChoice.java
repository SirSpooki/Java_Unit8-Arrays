import java.util.*;
import java.util.Scanner;
public class CarCareChoice {
    static int[] prices = {25, 22, 15, 5};
    static String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        showSelection();
        System.out.println("");
        String user = scan.nextLine();

        for(int x = 0; x < services.length; ++x)
            {
                if(user.equals(services[x]))
                    {
                        System.out.println(services[x]+" price is $"+prices[x]);
                    }
                else
                    {
                        System.out.println("Invalid Entry");
                    }
            }
    }

    public static void showSelection()
        {
            System.out.println("Enter selection:");
            System.out.println("   oil change");
            System.out.println("   tire rotation");
            System.out.println("   battery check");
            System.out.println("   brake inspection");
        }
}
