package JavaFeb2020;

public class SwitchCase {

	public static void main(String[] args) {
		// Work done and then use break
		int i = 1;

		switch (i) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;

		default:
			System.out.println("case not found");
		}

		String browserName = "Chrome";

		// switch(browserName) {
		// case "Chrome";
		System.out.println("launch Chrome");

	}

}
