import java.util.Scanner;

public class PhoneNumbers {

    static int linearSearch(String[] arr, String key, int len) {
        for (int i = 0; i < len; i++) {
            if (arr[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] name = new String[30];
        String[] phoneNumbers = new String[30];
        int count = 10;
        name[0] = "Gina";
        phoneNumbers[0] = "(847) 341-0912";
        name[1] = "Marcia";
        phoneNumbers[1] = "(847) 341-2392";
        name[2] = "Rita";
        phoneNumbers[2] = "(847) 354-0654";
        name[3] = "Jennifer";
        phoneNumbers[3] = "(414) 234-0912";
        name[4] = "Fred";
        phoneNumbers[4] = "(414) 435-6567";
        name[5] = "Neil";
        phoneNumbers[5] = "(608) 123-0904";
        name[6] = "Judy";
        phoneNumbers[6] = "(608) 435-0434";
        name[7] = "Arlene";
        phoneNumbers[7] = "(608) 123-0312";
        name[8] = "LaWanda";
        phoneNumbers[8] = "(920) 787-9813";
        name[9] = "Deepak";
        phoneNumbers[9] = "(930) 412-0991";

        Scanner sc = new Scanner(System.in);
        String n, ph;
        int index;
        System.out.print("Enter name to search: ");
        n = sc.nextLine();
        
        while (!n.equals("quit")) {
            index = linearSearch(name, n, count);
            if (index == -1) {
                System.out.println("Name not found in the array");
                System.out.print("Enter phone number: ");
                ph = sc.nextLine();
                if (count == 30) {
                    break;
                }
                name[count] = n;
                phoneNumbers[count] = ph;
                count++;
            } else {
                System.out.println("phone number is: " + phoneNumbers[index]);
            }
            System.out.print("Enter name to search(quit to exit from program): ");
            n = sc.nextLine();
        }
    }
}
