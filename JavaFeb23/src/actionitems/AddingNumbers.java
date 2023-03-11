package actionitems;

public class AddingNumbers {
	public static void main(String[] args) {

		// FOR LOOP - SUM
		int sum = 0;
		for (int i = 0; i <= 15; i++) {
			sum = sum + i;

		}
		System.out.println("The resultsis: " + sum);

		// WHILE LOOP FOR SUM
		int sum1 = 0;
		int i = 0;
		while (i <= 15) {
			sum1 = sum1 + i;
			i++;
		}
		System.out.println("The result is :" + sum1);

	}
}
