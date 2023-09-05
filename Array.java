	/* here marks before equal is reference and int after 
		 * equal is object 
		 * This below code shows that we have created a array above and
		 * stored 6 marks of any student where in the below commented
		 * line marks[0] = 1100; is nothing but it will replace the 
		 * above mentioned marks 100 to 1100
		 * ARRAY STARTS WITH 0
		 * 
		 * ARRAY IS A COLECTION OF SIMILAR TYPES OF DATA
		 * First way :
		 * int[] marks; >>>> Declaration
		 * marks = new int[]; >>>> Memory allocation
		 * 
		 * Easy and Second way: 
		 * int[]marks= new int[]; >> Declaration + Memory allocation
		 * 
		 * Most easy and third way:
		 * 
		 * int[]marks = {1,2,3,4,5} >> Declare + initialize
		 * 
		 * ARRAY>>> 0 TO N-1 WHERE n IS THE SIZE OF ARRAY
		 */

package Test;

public class Array {

	public static void main(String[] args) {
		// Second way
		
		int [] marks = new int[6]; 
		marks[0] = 100;
		//marks[0] = 1100;
		marks[1] = 89;
		marks[2] = 46;
		marks[3] = 56;
		marks[4] = 66;
		marks[5] = 76;
		System.out.println(marks[0]);
		// Third way
		int [] score = {23, 34, 45, 56, 67};
	    System.out.println(score[2]);

	}
	
	
}
	
