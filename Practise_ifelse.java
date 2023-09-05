package Test;
import java.util.Scanner;

public class Practise_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you age for verification: ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are good to go");
		}
		else {
			System.out.println("Not eligible, Sorry");
		}
		
		

	}

}
