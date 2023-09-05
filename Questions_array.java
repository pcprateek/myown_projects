package Test;

public class Questions_array {

	public static void main(String[] args) {
		// QUESTION 1: SUM of float element in array
		
		float [] marks = {1.2f,2.3f,3,4f,23.1f,23.5f};
		float sum = 0;
		for(float element:marks) {
			sum = sum + element;
		}
		System.out.println(" The sum is : " + sum);

	}

}
