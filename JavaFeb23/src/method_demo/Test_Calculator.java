package method_demo;

public class Test_Calculator {

	public static void main(String[] args) {
		
		//Create an object of Calculator Class
		Calculator calc = new Calculator ();
		
		System.out.println("Addition of a and b is: " + calc.doAdd(25, 12)); //37
		
		
		System.out.println("Subtraction of a and b is: " + calc.doSub(25, 12)); //13
		
		System.out.println(calc.concatStr("Hello,", "I am Learning Java! Its fun!"));
		
		Test_Calculator obj = new Test_Calculator ();
		System.out.println(obj.doMul(54, 95));
		System.out.println(doDiv(70, 7)) ;	
		obj.sound();
		obj.dogsound();
		System.out.println(Calculator.do3mul(4, 722, 67));
		
	}
	 
	public int doMul ( int a, int b) { 
		int c = a * b;
		System.out.println("Multiplication");
		return c;
		
		
		
		}
	
	public static double doDiv( int a, int b) {
		double c = a/b;
		return c;
	}
	
	public void sound ()
	{
		System.out.println("This is a generic sound");
	}
	
	public void dogsound () {
		sound();
		System.out.println("This is a dog sound");
	}
	
	}





















