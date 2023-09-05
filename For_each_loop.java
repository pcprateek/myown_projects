//Array can be also Float

package Test;

public class For_each_loop {

	public static void main(String[] args) {
		// Array length
// Int
		// the below code will show the length of the array
		// By using (.length)
		int [] marks = {23, 34, 45, 56, 67};
		System.out.println("Printing array's length below: ");
		System.out.println(marks.length);
		System.out.println("Printing the array using For loop");
		
		// Displaying the array through For loop
		for (int i =0; i<marks.length; i++) {
			
			System.out.println(marks[i]);
		}
		
		// For each loop: 
		System.out.println("Printing the array using For each loop");
		for (int element: marks) {
			System.out.println(element);
		}
		
		
		
// Float		
		//float [] mark = {23.4f, 34.2f, 45.1f, 56.2f, 67.3f};
		//System.out.println(mark.length);
		//System.out.println(mark[0]);

		
// String 
		 
		
		//String[] names = {"First", "Second", "Third"};
		//System.out.println(names[1]);
	}

}
