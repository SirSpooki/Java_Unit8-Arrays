import java.util.*;
import java.util.Scanner;
public class CategorizeStrings {
   static Scanner scan = new Scanner(System.in);
   static String[] shortStrings = new String[20];
   static String[] longStrings = new String[20]; 
   static int shortCount = 0, longCount = 0;
   public static void main (String[] args)
   {
      fillArrays();
      whichToShow();
   }

   public static void fillArrays()
   {
       String user = "";
       int length = 0;
       int count = 0;
       System.out.println("Enter a string or ZZZ to quit >> ");
       while(!user.equals("ZZZ") && count < 20)
        {
            user = scan.nextLine();
            if(user.equals("ZZZ"))
                {
                    break;
                }
            length = countChars(user);
            if (length <= 10)
                {
                    shortStrings[shortCount] = user;
                    ++shortCount;
                }
            if (length >= 11)
                {
                    longStrings[longCount] = user;
                    ++longCount;
                }
            ++count;
            System.out.println("Enter a string or ZZZ to quit >> ");
        }
   }

   public static int countChars(String u)
   {
        int chars = u.length(); 
        return chars;
   }

   public static void whichToShow()
   {
        boolean allNullShort = true;
        boolean allNullLong = true;
        String user = "";
        System.out.println("Do you want to see the list of short strings or the list of long strings?");
        System.out.println("   Please enter S or L or ZZZ to quit >> ");
       while(!user.equals("ZZZ"))
        {
            user = scan.nextLine();
            if(user.equals("ZZZ"))
                {
                    break;
                }

            if (user.equals("S"))
                {
                   for(int x = 0; x < shortStrings.length; ++x)
                    {
                        if(shortStrings[x]!=null)
                            {
                                allNullShort = false;
                            }
                    }
                    if (allNullShort == false)
                        {
                            for (int x = 0; x < shortCount; ++x)
                                {
                                    System.out.println(shortStrings[x]+" ");
                                }
                        }
                    else
                        {
                            System.out.println("The list is empty");
                        }
                }
            else
                {
                    for(int x = 0; x < longStrings.length; ++x)
                     {
                        if(longStrings[x]!=null)
                            {
                                allNullLong = false;
                            }
                     }
                    
                        if (allNullLong == false)
                        {
                            for (int x = 0; x < longCount; ++x)
                                {
                                    System.out.println(longStrings[x]+" ");
                                }
                        }
                    else
                        {
                            System.out.println("The list is empty");
                        }
                   
                }
             System.out.println("Do you want to see the list of short strings or the list of long strings?");
             System.out.println("   Please enter S or L or ZZZ to quit >> ");
        }

       
   }
}

