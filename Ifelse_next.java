package Test;
import java.util.Scanner;

public class Ifelse_next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats your Age: ");
		int Age=sc.nextInt();
		if (Age >= 18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not eligible");
		}

	}

}
