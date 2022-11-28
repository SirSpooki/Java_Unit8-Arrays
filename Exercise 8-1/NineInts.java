import java.io.*; 
import java.util.Arrays; 
public class NineInts {
    public static void main (String args[]) 
    {
        int[] numbers = {10, 15, 19, 23, 26, 29, 31, 34, 38};
                System.out.println(Arrays.toString(numbers));
                System.out.print("[");
                for(int x = numbers.length-1; x >= 0; --x)
                    {

                        System.out.print(numbers[x]+" ");
                    }
                System.out.print("]");
                
    }
}
