package Test;

public class Multidiamentional_array {

	public static void main(String[] args) {
		// Printing a 2D array
		
		int [][] flat;
		flat = new int[2][3];
		
		flat [0][0] = 101;
		flat [0][1] = 102;
		flat [0][2] = 103;
		flat [1][0] = 101;
		flat [1][1] = 101;
		flat [1][2] = 101;
		
		
		System.out.println("Printing 2D array using for loop");
		for(int i=0; i<flat.length; i++){
			for(int j=0; j<flat[i].length; j++){
				System.out.print(flat[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
