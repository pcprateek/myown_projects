package Test;

public class Break_continue {

	public static void main(String[] args) {
		// Break Condition
		for (int i = 0; i<=5; i++) {
			System.out.println(i);
			System.out.println("Ab nhi to kabhi nhi");
			if(i==2){
				System.out.println("Ending the loop");
				break;
			}
		}
		// Continue statement
		for (int x =0; x<=7;x++) {
			System.out.println(x);
			if(x==4) {
				System.out.println("Its continue after 4");
				continue;
				
				
				// SOLVE 25 VIDEO OF CWH
			}
		}

	}

}
