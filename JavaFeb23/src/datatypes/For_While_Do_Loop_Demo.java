package datatypes;

public class For_While_Do_Loop_Demo {

	public static void main(String[] args) {
		
	//For Loop	
		System.out.println("Starts For Loop"); 
			for(int i=1; i <=3; i++) {
		System.out.println( i + ".I am from Canada");
		}
			System.out.println("Ends");
			
			
	//While Loop		
			System.out.println("Starts While Loop");
			
			int i = 1;String c = "Canada";
			while( i <=3) {
				System.out.println( " I am from "+ c);
				i++;
			}
			System.out.println("Ends ");
			
			//
			String place = "Canada";
			int start = 1;
			while( start <=3) {
				System.out.println( " I am from "+ place);
				start++;
			}
			
	//Do Loop		
			System.out.println("Starts Do Loop");
			
			int j = 1; String d = "Canada";
			do {
				System.out.println( " I am from "+ d);
				j++;
			}
			while (j<= 3);
			System.out.println("Ends ");
			
		
	}

} 
//Know how many times the iterations will take place- FOR LOOP
//Not sure how many iterations will take place - WHILE LOOP
// Know how many times, but the condition should be met at least once - DO WHILE LOOP