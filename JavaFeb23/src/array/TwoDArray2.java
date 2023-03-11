package array;

public class TwoDArray2 {

	public static void main(String[] args) {


		//
		int [][] my2DArray = new int[2][3];
		
		my2DArray [0][0]= 5;
		my2DArray [0][1]= 6;
		my2DArray [0][2]= 7;
		
		my2DArray [1][0]= 8;
		my2DArray [1][1]= 9;
		my2DArray [1][2]= 3;
		
		//System.out.println(my2DArray [0][1]);
		
		int lengthFirstArray = my2DArray.length;
		int lengthSecondArray = my2DArray[0].length;
		System.out.println("Lengths of 2D Array");
		System.out.println(lengthFirstArray);
		System.out.println(lengthSecondArray);

		System.out.println("Capturing all the values from 2D");

		for (int i = 0; i <my2DArray.length; i++)
		{
			for (int j=0; j<my2DArray[0].length; j++)
			{
				System.out.println(my2DArray[i][j]);
			}
		}
		System.out.println("The compiler is out of the nested loop!");
		
		
		
		//another way of declaring 2D Array
		int [][] array2 = {{4,56,83},{90,20,63}};
		int length = array2.length;
		int length2 = array2[1].length;
		
		for (int i = 0; i<length; i++) {
			for (int j = 0; j<length2; j++) {
				System.out.println(array2[i][j]);
			}
		}
		
		
		
				
				
				
				
				
	}

}
