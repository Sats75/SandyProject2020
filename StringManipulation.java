package JavaFeb2020;

//String will behave like an array (First index will be 0 
public class StringManipulation {

	public static void main(String[] args) {

		String str = "This is my first java code and iam very happy";

		System.out.println(str.length());
		System.out.println("li = 0");
		System.out.println("hi = " + (str.length() - 1));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(44)); // String index out of bound exception
		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', str.indexOf('s') + 1));
		System.out.println(str.indexOf("java"));

		// trim
		String s = "         hello world";
		System.out.println(s.trim());

		String s1 = "         hello java";
		System.out.println(s1.replace(" ", " "));

		// Comparison
		String browser = "chrome";
		String browser1 = "Chrome";
		System.out.println(browser.equals(browser1));
		System.out.println(browser.equalsIgnoreCase(browser1));

		// Contains
		String msg = "      Welcome to java world       ";
		System.out.println(msg.trim().contains("java"));

		String msg1 = msg.trim();
		System.out.println(msg1);
		System.out.println(msg1.contains("java"));

		// split
		String lang = "Java_Python_Javascript_Ruby";
		String langVal[] = lang.split("_");
		System.out.println(langVal.length);

		for (int i = 0; i <= langVal.length; i++) {
			// System.out.println(langVal[i]);
		}

		System.out.println("__________");
		String name = "xXtestxxXjavaXxXselenium";
		String nameArr[] = name.split("xX");
		System.out.println("________________");

		// split in selenium for test data:
		String userData = "Tom;Steve;tom@gmail.com;999;London ";
		System.out.println(userData.split(";")[0]);
		System.out.println(userData.split(";")[1]);

		// cases
		String value = "this is java world";
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());

		// sub string
		String message = "Your transaction id is 121313";
		System.out.println(message.substring(0, 10));
		System.out.println(message.indexOf("is"));
		System.out.println(message.substring(23));
		System.out.println(message.substring(message.indexOf("is") + 3, message.length()));

		System.out.println("________________");

		String welcome = "welcome admin";
		if (welcome.indexOf("admin") > 0) {
			System.out.println("Admin is present in string");
		} else
			System.out.println("Admin is NOT present in string");

	}

}