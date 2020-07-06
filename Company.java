package JavaFeb2020;

//Constructor of class.Constructor name is same as class name 
//Cannot return any value .Don't write any return type  = =IQ .No void statement
//it looks like a function but its not a function   = IQ .Function can be void or non void.
//Constructor will never be stored inside the object .Constructors are not objects
//Can we overload constructor - yes
//Short cut to create constructor = Rt CLICK -- Source--- Create Constructor with fields 
//Diff between constructor and functions
//Teaching - First run without any data inside main method (Video - 7.46 and `14th min ,  16.31,18.55 min)
//Just explain references s1=s2 and s2=s3 and s3=s1 ( With student class)
public class Company {
	// Class variables
	String name;
	String ceo;
	String product;
	long revenue;
	int empCount;
	//static int holidaycount = 20;  //Never use static inside object or constructor 

	public Company() {
		System.out.println("Default Constructor");
	}

	public Company(int a) {
		System.out.println("one param Constructor" + a);
	}

	// Create constructor with all the class variables  (given below) --- Const name is not equal to class name= null

	public Company(String name, String ceo, String Product, long revenue, int empCount) {
		// name = name1; //poor programming as we need to change the name
		this.name = name;     //this.classvar = localvar
		this.ceo  = ceo;
	}

	public static void main(String[] args) {

		Company c1 = new Company(11);
		Company c2 = new Company("Google", "Sundar Pichai", "Google cloud", 1000, 10099);
	//	Company c3 = new Company("XYZ","Steve","Samsung");
		System.out.println(c2.name);

	}

}
