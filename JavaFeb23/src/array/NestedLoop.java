package array;

public class NestedLoop {

	public static void main(String[] args) {

		/*Create a nested loop
		 * While Loop three times
		 * For Loop four times
		 * Do while Loop five times
		 * It would iterate 60 times!
		 */
		
		int i = 0;
		int count = 0;
		
		
		while (i <3) {
			for (int j=0; j<4; j++)  
				{
				int k=0;
				
				do {
					System.out.println(" i-> " + i + " j-> " + j + " k-> " + k);
					k++;
					count++;
					
				}
				while (k<5);
			}
			i++;
		
		System.out.println("The iteration count is : " + count);
		
		
		}
		
		
		
		
		
		
		
	}

}
