package JavaFeb2020;

public class ConditionalOperators {

	public static void main(String[] args) {

		// Code to be written in this brackets only
		// Show only if : Then else : then a>=b :
		// = (Assignment and memory allocation) , == , < > <= >=

		int a = 10;
		int b = 5;

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		int total = 100;
		int tax = 50;
		int finalamt = total + tax;

		int pendingamt = 150;

		if (finalamt == pendingamt) {
			System.out.println("bill is paid");
		}

		else {
			System.out.println("Please pay the pending amount");

		}

		// String comparison = Mention about equal and equalignorecase;dont use multiple
		// condition : Explain debug   and then explain if and else if and then else ( Not mandatory but better to write)
		// && = AND operator is also called as short circuit operator ..|| ..Or operator

		String s1 = "This is Java";
		String s2 = "This is java";

		if (s1.equals(s2)) {
			System.out.println("both are equal");
		}

		else {
			System.out.println("Both are not equal");
		}

		String browser = "Firefox";

		if (browser.equals("Chrome")) {

			System.out.println("Launch Chrome");

		}

		else if (browser.equals("Firefox")) {

			System.out.println("Launch firefox");
		}

		else if (browser.equals("IE")) {

			System.out.println("Launch IE");
		}

		else {
			System.out.println("No other browser exists " + browser);
		}
	}

}
