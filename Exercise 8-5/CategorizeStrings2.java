import java.util.*;
public class CategorizeStrings2
{
   // Modify the code below
   public static void main (String[] args)
   {
      final int MAX = 20;
      final int CUTOFF = 10;
      final String QUIT = "ZZZ";
      String entry;
      int oneSub = 0;
      int twoSub = 0;
      int moreSub = 0;
      int numOfSpaces = 0;
      Scanner input = new Scanner(System.in);
      String[] oneWord = new String[MAX];
      String[] twoWord = new String[MAX];
      String[] moreWord = new String[MAX];

      System.out.print("Enter a string or " +
         QUIT + " to quit >> ");
      entry = input.nextLine();
      while(!entry.equals(QUIT) && (oneSub + twoSub + moreSub < MAX))
      {
        for (char c : entry.toCharArray()) {
            if (c == ' ') 
            {
                numOfSpaces++;
            }
}
         if(numOfSpaces == 0)
         {
            oneWord[oneSub] = entry;
            ++oneSub;
         }
         if(numOfSpaces == 1)
         {
            twoWord[twoSub] = entry;
            ++twoSub;
         }
         if(numOfSpaces > 1)
         {
            moreWord[moreSub] = entry;
            ++moreSub;
         }
         if(oneSub + twoSub+moreSub < MAX)
         {
            System.out.print("Enter a string or " +
               QUIT + " to quit >> ");
            entry = input.nextLine();
         }
      }
      System.out.println("\nDo you want to see the list of one-word strings, two-word strings, or longer strings?");
      System.out.print("   Please enter O, T, or L, or ZZZ to quit >> " +
         QUIT + " to quit >> ");
      entry = input.nextLine();
      while(!entry.equals(QUIT))
      {
          if(entry.substring(0).toLowerCase().equals("o"))
            {
             display(oneWord, oneSub);
            }
          if(entry.substring(0).toLowerCase().equals("t"))
            {
             display(twoWord, twoSub);
            }
          if(entry.substring(0).toLowerCase().equals("l"))
            {
             display(moreWord, moreSub);
            }
          else if (!entry.substring(0).toLowerCase().equals("o") && !entry.substring(0).toLowerCase().equals("t") && !(entry.substring(0).toLowerCase().equals("l")))
            {
             display(oneWord, oneSub);
             display(twoWord, twoSub);
             display(moreWord, moreSub);
            }
          System.out.println("\nDo you want to see the list of one-word strings, two-word strings, or longer strings?");
          System.out.print("   Please enter O, T, or L, or ZZZ to quit >> " +
             QUIT + " to quit >> ");
          entry = input.nextLine();
      }
   }
   public static void display(String[] array, int max)
   {
      System.out.println();
      if(max == 0)
         System.out.println("The list is empty");
      else
         for(int x = 0; x < max; ++x)
            System.out.println(array[x]); 
   }
}
