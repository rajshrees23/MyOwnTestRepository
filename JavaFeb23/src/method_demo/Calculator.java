package method_demo;

public class Calculator {

	public int doAdd(int a, int b) {
		int c = a + b;
		
		return c;
		//System.out.println("");
	}
	
	public int doSub (int a , int b) {
		int c = a - b ;
		return c;
	}
		
	public String concatStr(String a, String b) {
		String c;
		c = a + " " + b;
		return c;
	}
	
	
	public static int do3mul(int a, int b, int c) {
		int result = a * b * c;
		return result;
		
		
	}
	}
	


