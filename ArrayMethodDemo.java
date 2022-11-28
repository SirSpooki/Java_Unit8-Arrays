import java.util.stream.*;
import java.io.*; 
import java.util.Arrays; 
public class ArrayMethodDemo {
    public static void main (String args[]) {
        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7};
        int limit = 12;
        System.out.println("Numbers in order: ");
        display(numbers);
        System.out.println();
        System.out.println("Numbers in reverse: ");
        displayReverse(numbers);
        System.out.println();
        displaySum(numbers);
        System.out.println("Numbers less than limit: ");
        displayLessThan(numbers, limit);
         System.out.println();
        System.out.println("Numbers higher than avg: ");
        displayHigherThanAverage(numbers);
    }
    public static void display(int[] numbers) 
    {
        for(int nums : numbers)
            {
                System.out.print(nums+" ");       
            }
    }
    public static void displayReverse(int[] numbers) 
    {
        for( int x = numbers.length - 1; x >= 0; --x)
            {
                System.out.print(numbers[x]+" ");
            }    
    }
    public static void displaySum(int[] numbers) 
    {
        System.out.println("Sum is "+Arrays.stream(numbers).sum());
    }
    public static void displayLessThan(int[] numbers, int limit) 
    {
        for(int nums : numbers)
            {
                if(nums < limit)
                    {
                        System.out.print(nums+" ");
                    }
            }
    }
    public static void displayHigherThanAverage(int[] numbers) 
    {
        int sum = Arrays.stream(numbers).sum();
        int avg = sum/numbers.length-1;
        
        for(int nums : numbers)
            {
                if(nums > avg)
                    {
                        System.out.print(nums+" ");
                    }
            }
    }
}
