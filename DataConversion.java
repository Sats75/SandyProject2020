package JavaFeb2020;

//Useful in Selenium (till 25th minute "Java_17_WrapperClasses_StringManipulation.mp4

public class DataConversion {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		//wrapper classes 
		int i = Integer.parseInt(x);   //100
		System.out.println(i+20);
		
		String total = "1000";      //same do it with 1000A
		System.out.println(total + 50);
		
		int totalVal = Integer.parseInt(total); //Numberformat exception for  input string 1000A 
		System.out.println(totalVal + 50);
		
		//String to double 
		String y = "122.44";
		System.out.println(y+20);
		double d =	Double.parseDouble(y) + 20;
		
		//Integer to String 
		 int p = 200;
		String str = String.valueOf(p);  
		System.out.println(str+20);
		
		String test =  String.valueOf(true) +   +" hello";
		System.out.println(test);
		
		
		
		
	}

}
