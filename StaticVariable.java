package JavaFeb2020;

public class StaticVariable {

	//We will never declare static for method variables 
	String name;
	static int age ;
	
	public void getName() {
		System.out.println("get name");
	}
	
	
	public static void getValue() {
		System.out.println("get value");
	
	}	
   public static void main(String[]args) {
	   StaticVariable obj =  new StaticVariable();
	   obj.name = "Tom";
	
	   //Static variables - OBJ will never store any static data 
	 System.out.println(age);  
	 getValue(); 
	 System.out.println(StaticVariable.age);  
	 StaticVariable.getValue();
   }
		
		
		
		
	}


