package JavaFeb2020;

public class Class {

	//Class Variables/ Properties
		
	String name;
	int age ;
	int empid;
	boolean permanent;
	String role;	
	

	public static void main(String[] args) {
		
		//Create the object of employee class.......Java will create a object....photocopy of properties will be given to each object
		//use new keyword...
		//Object is RHS ...e1 is ORV and Employee is class name
		//Explain no name concept but this is not the right approach 
		
		Class e1 = new Class ();
		e1.name = "Sandy";
		e1.age = 20;
		e1.empid = 121;
		e1.role = "QA";
		e1.permanent = true;
		
		System.out.println(e1.name);
		
	//Similarly do for e2 ...	
		
		Class e2 = new Class ();
		e2.name = "gaya3";
		e2.age = 15;
		e2.empid = 341;
		

		
		

		
		
		
		
		
		
		
		
	}

}
