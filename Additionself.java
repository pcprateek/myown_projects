package Test;
import java.util.Scanner;

public class Additionself{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" RTO Progrfam for license: ");
		int Age = sc.nextInt();
		
		if (Age >= 18) {
			System.out.println(" ELigible");
		}
		else {
			System.out.println("Not eligible");
		}
		
	}
	
	
}

