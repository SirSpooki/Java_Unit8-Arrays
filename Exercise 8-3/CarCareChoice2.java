import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
public class CarCareChoice2
{
   // Modify the code below
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      boolean isMatch = false;
      String[] items =  { "oil change", "tire rotation",
         "battery check", "brake inspection"};
      int[] prices = {25, 22, 15, 5};
      int x;
      int matchIndex = 0;
      String menu = "Enter selection:";
      for(x = 0; x < items.length; ++x)
        menu += "\n   " + items[x];
      System.out.println(menu);
      String selection = input.nextLine();
      for (x = 0; x < items.length; x++)
      if(items[x].charAt(0) == selection.charAt(0))
      {
        if (items[x].charAt(1) == selection.charAt(1))
            {
               if (items[x].charAt(2) == selection.charAt(2)) 
                {
                    isMatch = true;
	                matchIndex = x;
                }
            }
      }
      if(isMatch)
          System.out.println(selection + " price is $" + prices[matchIndex]);
      else
          System.out.println("Invalid Entry");
  }
}
