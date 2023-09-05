package Test;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] marks = {1,2,3,4,5};
		System.out.println("Reverse array");
		for (int i = marks.length - 1; i>=0; i--) {
			System.out.println(marks[i]);
		}
		
		int [] score= {6,7,8,9,10};
		System.out.println(" Straigth array");
		for (int i = 0; i<marks.length; i++){
			System.out.println(score[i]);
		}
	}

}
