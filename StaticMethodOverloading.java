package JavaFeb2020;

public class StaticMethodOverloading {
	//We can overload static method
	//We can overload main method but practically not used.
	
	public static void getName() {
		
	}
	
	public static void getName(int a) {

	}

	public static void main(String[] args) {
	System.out.println("main method");
	StaticMethodOverloading.getName();
	StaticMethodOverloading.getName(10);
		
		
		
		
	}

}
