package JavaFeb2020;

public class LoopingConcept {

	public static void main(String[] args) {

		// Initialization .Condition and Increment part
		// Remember to give

		int i = 10;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// For loop = Infinite loop if u dont mentioned k++
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}

		System.out.println("---EVEN-----------");

		for (int a = 2; a <= 10; a = a + 2) {
			System.out.println(a);
		}

		// Odd
		System.out.println("---ODD-----------");
		for (int b = 1; b <= 10; b = b + 2) {
			System.out.println(b);

		}

		for (int m = 1; m <= 10; m++) {
			if (m % 2 == 0) {
				System.out.println(m);
			}

		}
	}
}