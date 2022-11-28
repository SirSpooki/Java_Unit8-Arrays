import java.util.*;
import java.util.Scanner;
import java.util.stream.*;
public class DistanceFromAverage {
    static double[] userNums = new double[15];
    public static void main (String[] args) 
    {
        int count = 0;
        double user = 0;
        double avg, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numeric value or 99999 to quit >> ");
        user = scan.nextDouble();
        if(user == 99999)
                    {
                        System.out.println("Error Must Input numbers");
                    }

        while(user != 99999 && count <= 15)
            {
                userNums[count] = user; 
                ++count;
                System.out.println("Enter next numeric value or 99999 to quit >> ");
                user = scan.nextDouble();
            }
        sum = Arrays.stream(userNums).sum();
        avg = sum/count;

        System.out.println("Your entered "+count+" numbers and their average is "+avg);
        for(int x = 0; x <= count; ++x)
            {
                double distance = userNums[x] - avg;
                System.out.println(userNums[x]+" is "+distance+" away from the average");
            }

        
    }
}
