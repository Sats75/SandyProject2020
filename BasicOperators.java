package JavaFeb2020;

public class BasicOperators {

	public static void main(String[] args) {
		

		// int x=9/0; //Arithmatic exception
		// System.out.println(x);

		// int y=0/9;
		// System.out.println(y);

		int p = 10;
		int q = p % 3; // Modulus means remainder
		System.out.println(q);

		int num = 15;
		if (num % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("odd number");
		}

		// ------------------------
		if (num > 0) {
			System.out.println("+ve number");
		} else if (num < 0) {
			System.out.println("-ve number");
		} else {
			System.out.println("number is 0");
		}

		// Ternary operators -- ?
		int z = 14;
		String s = (z > 0) ? "Hi" : "Bye";
		System.out.println(s);

		int n1 = 15;
		int n2 = 10;
		int max;
		max = (n1 > n2) ? n1 : n2;
		System.out.println("Max number is :" + max);

		String browser = "Chrome";
		String s1 = (browser.equals("Chrome")) ? "Chrome" : "Firefox";
		System.out.println(s1);

		// Dead code = Directly printing -- no condition .......Nothing is mentioned....
		if (true) {
			System.out.println("This is true");
		} else {
			System.out.println("bye");
		}

		// ! = Not operator

		String name = "";
		if (!name.equals("")) {
			System.out.println("name is  :" + name);
		} else {
			System.out.println("value is blank ");

		}
	}

}
