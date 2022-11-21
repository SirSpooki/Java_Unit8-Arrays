import java.util.Scanner;
public class CertOfDepositArray {

	public static void main(String[] args) {	
		CertOfDeposit cdArray[]=new CertOfDeposit[5];
		input(cdArray);
		display(cdArray);
	}
	public static void input(CertOfDeposit arr[]) {
		Scanner sc=new Scanner(System.in);
		String certNum;
		String lastName;
		double balance;
		int monthOfIssue;
		int dayOfIssue;
		int yearOfIssue;
		for(int i=0;i<arr.length;i++) {
			System.out.print("Certificate #: ");
			certNum=sc.nextLine();
			System.out.print("Last name: ");
			lastName=sc.nextLine();
			System.out.print("Balance: ");
			balance=Double.parseDouble(sc.nextLine());
			System.out.print("Month of issue: ");
			monthOfIssue=Integer.parseInt(sc.nextLine());
			System.out.print("Day of issue: ");
			dayOfIssue=Integer.parseInt(sc.nextLine());
			System.out.print("Year of issue: ");
			yearOfIssue=Integer.parseInt(sc.nextLine());
			System.out.println();
			arr[i]=new CertOfDeposit(certNum,lastName,balance,monthOfIssue,dayOfIssue,yearOfIssue);
		}
		sc.close();
	}
	public static void display(CertOfDeposit arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Certificate "+arr[i].getCertNum()+
			"\nName: "+arr[i].getLastName()+
			"\nBalance: "+arr[i].getBalance()+
			"\nIssued: "+arr[i].getIssueDate()+
			"\nMatures: "+arr[i].getMaturityDate());
			System.out.println();
		}
	}

}
