public class DebugEight2
{
	public static void main(String[] args) {
	int[] someNums = { 4, 17, 22, 8, 35 };
		// Initializing sum =0 to add total of all elements of array
		double sum = 0;

		// starting loop from 0 index and end with last index
		for (int i = 0; i < someNums.length; i++) {

			// here it will add all elements
			// for example :at i=0
			// sum = 0 +4=4
			// now again sum = 4 +17 = 21
			// this will follow up until total sum is calculated
			sum = sum + someNums[i];
		}
		
		double average =sum / someNums.length;

		// printing the sum
		System.out.println("Sum is " + sum);
		// average is the sum of element divided by total elements
		System.out.println("Average is " +average );
	}
}
