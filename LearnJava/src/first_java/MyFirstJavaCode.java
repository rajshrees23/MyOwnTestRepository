package first_java;

public class MyFirstJavaCode {

	public static void main(String[] args) {
	
		System.out.println("I am learning java!");    
	
		//open a browser
		// go to shop.con
		// select software cat
		// hit enter and go'}

		//data types in java (object oriented programming language)<-- OOP
		//grade=99
		int mathgrade = 99;
		int javagrade = 100;
		int totalgrade = mathgrade+javagrade;
				
		long credit_card= 1234567893409874L;
		double bankrate= 8.09;
		float pi= 0.90849720509f;
		boolean isdone=  false;
		char Answer = 'N'; 
		//data type, variable = value (declaring a variable to represent grade value)
		//class- to describe the object
System.out.println("My Total Grade; "+totalgrade);

//>, < >=, ==, != // comparison operators
if (mathgrade>javagrade) {
	System.out.println("You are good in Math! Need to work on java!");
}
if (javagrade>mathgrade) {
	System.out.println("You are good in java! Need to work on math!");
}
	}
}