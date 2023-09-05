package Test;
import java.util.Scanner;
public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Age;
		System.out.println(" enter your Age: ");
		Scanner sc = new Scanner(System.in);
		Age = sc.nextInt();
		
		switch(Age) {
		case 18:
			System.out.println("You're going to become adult now");
			break;
		case 19:
			System.out.println("You're close to adult");
			break;
		case 20:
			System.out.println(" Congrats you are adult now");
		}
		
		System.out.println(" Okay bye");
		
		/*
		if (Age>=56) {
			System.out.println("You're experienced");
		}
		
		else if (Age>=46) {
			System.out.println("You're Semi- Experienced");
		}
		
		else if (Age>=36) {
			System.out.println("You're Semi-Semi- Experienced");
		}
		
		else {
			System.out.println("You're a kid now");
		}
*/
		
		
		
	}

}
 