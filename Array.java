package JavaFeb2020;

public class Array {

	public static void main(String[] args) {
		// Special variable holding number of values of class array which has similar
		// data types
		// Array stores data using indexing ..Length is size = 3 ( Length = HI+1) .
		// i[4] = Array index out of bound exception
		// Default value of int is 0 (Out of 10 dabbas only 2 values are given) .
		// Default value of string is null ;Boolean = false;
		// Limitation = Array size is fixed. It can store only similar types of data.
		// We cannot have negative values.
		// To solve this problem we have dynamic array(Eg Amazon ...new products are
		// getting displayed).
		/**
		 * This method is returning length... This is called documentation 
		 */

		int i[] = new int[3];

		i[0] = 10;
		i[1] = 20;
		i[2] = 33;
		System.out.println(i[0]);
		System.out.println(i.length); // 3
		int len = i.length;
		int HI = len - 1;
		System.out.println(HI);

		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}

		double d[] = new double[2];
		d[0] = 10;
		d[1] = 14.33;

		char c[] = new char[1];

		boolean b[] = new boolean[0];

		// String array
		String str[] = new String[2];
		str[0] = "Java";
		str[1] = "C++";

		System.out.println(str[1]);
	}

}
