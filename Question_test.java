package Test;
import java.util.Scanner;

public class Question_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Question number 1
		// Whats the output
		
		
//		int a = 10;
//		if (a=11) {
//			System.out.println(" i'm 10");
//		}
//		else {
//			System.out.println(" i'm 11");
//		}
// It throws error because you cannot use one equal inside a cond.
		
		
		// Question number 2
		
		//Write a code to print exam results where you have to
		// Pass on 3 subject with more than 40%
		
		
	/*	int S1,S2,S3;
		System.out.println(" Student Pass/Fail calculator");
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your marks in S1");
		S1 = sc.nextInt();
		
		System.out.println(" Enter your marks in S2");
		S2 = sc.nextInt();
		
		System.out.println(" Enter your marks in S3");
		S3 = sc.nextInt();
		
		float avg = (S1+S2+S3)/3.0f;
		System.out.println(" Overall percentage is " + avg);
		
		if (avg>=40 && S1>=33 && S1>=33 && S1>=33) {
			System.out.println(" Congrats you're pass");
		}
		else {
			System.out.println("Failed");
		}
	*/
		
	//Question number 3
		/* Calculate tax given by an employee as per the slabs:
		 * Income Slab         Tax
		 * 2.5 L - 5 L         5%     
		 * 5.0 - 10.0 L        20%
		 * Above 10.0 L        30%
		 */
		
		// Solve later
		
		
	// Question number 4	
		
		/* Write the day of week in number as in if
		 * number 1 is given then its Monday and 2 for tuesday to 50 
		 */
	 /* Scanner sc = new Scanner(System.in);
		System.out.println(" Please type the number to find day: ");
		int day = sc.nextInt();
		switch (day) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday"); 
		case 3 -> System.out.println("Wednesday"); 
		case 4 -> System.out.println("Thursday"); 
		case 5 -> System.out.println("Friday"); 
		case 6 -> System.out.println("Saturday"); 
		case 7 -> System.out.println("Sunday"); 
		}
		*/
		
		
		// Write a code to find out the type of website 
		// if ts .org then its organzations, .in indian and
		// .com is commercial
		System.out.println(" Enter the type of website below: ");
		Scanner sc = new Scanner(System.in);
		String Website = sc.next();
		
		
		// We have used String
		if (Website.endsWith(".org")) {
			System.out.println("Its a Organizations website");
		}
		else if (Website.endsWith(".in")) {
			System.out.println(" Thats a Indian website");
		}
		else if (Website.endsWith(".com")) {
			System.out.println(" Its a commercial website ");
		}
		else {
			System.out.println(" Sorry we dont know further");
		}
		
		
	}

}
