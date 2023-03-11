package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowableDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Exception Handling does not make any sense!");
		Thread.sleep(3000);    
		try {
			FileInputStream fis = new FileInputStream ("");
		} catch (FileNotFoundException e) {
			System.out.println("Please check the filepath");
			e.printStackTrace();
		}
		
		System.out.println("Maybe it is something, not sure about the use of it");
		
		
	}

}
