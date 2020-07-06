package JavaFeb2020;

public class Car {
	
	//We dont create object to call main method .Hence it is static in nature
	
	String name;
	String modelname;
	int price;
	static int wheels=4;
	
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "Audi";
		c1.modelname = "Q1";
		c1.price= 80;
		
		Car c2 = new Car();
		c2.name = "BMW";
		c2.modelname = "520A1";
		c2.price = 60;
		System.out.println(c1.name);
		
		System.out.println(c2.price);


	}

}
