package array;

public class Pattern {

	public static void main(String[] args) {

		
		int i, j, k, row = 7;
		
		for(i = 1; i<=row; i++ ) {
			for (j= i+1; j<= row; j++) {
				System.out.print(" ");
			}
			for (k = 1; k<i*2; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		
			
		
		}
		System.out.println(" Hurray! I have done a pattern using nested loop ");
	}

}
