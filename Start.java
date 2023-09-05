package Test;
import java.util.Scanner;


public class Start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Hey Pc welcome to RTO: ");
		System.out.println("Enter you age");
		int Age = sc.nextInt();
		
		if (Age>= 18){
			System.out.println("You are eligible");
		}
		else {
			System.out.println("Not eligible");
		}
		

	}

}
