package JavaFeb2020;

public class AmazonSearch {
	// Same method name ; Different input parameters;Different types of parameters ;
	// different sequence parameters
	// Within same class only

	public void search() {
		System.out.println("0 param");
	}

	public void search(int a) {
		System.out.println("1 param");
	}

	public void search(int a, int b) {
		System.out.println("2 paramS");
	}

	public void search(int c, String d) {
		System.out.println("2 parameters");
	}

	public static void main(String[] args) {
		AmazonSearch as = new AmazonSearch();
		as.search();
		as.search(20);
		as.search(10, 55);

	}
} // Same example/assignment for loginpage