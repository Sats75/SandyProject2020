package JavaFeb2020;

public class TryCatchBlock {
	
//Unwanted code not recognized by java .Hence it will throw error message.
//Compiler or fatal error .Exception means null pointer ,Arithmetic exception,Arrayindexoutof bound exception .Exception is common	
//Try without catch block not allowed .One Try with multiple catch block is allowed.
	public static void main(String[] args) {
	
	System.out.println("A");
	System.out.println("A");
	System.out.println("A");

	try {
	int i = 9/0;
	System.out.println("ABC");
	int p[]= new int[1];
		p[0]=3;
		p[1]=5;
		p[2]=4;
		}
	catch(Exception e){                  //This will handle but if u want to report //Write parent name or if u know write correct name .Thorwable 
	System.out.println("some exception occurred");	
	System.out.println(e.getMessage());
//	e.printStackTrace();       Complete information about the error will be known
		}
		
	}
//	System.out.println("A");
//	System.out.println("A");

	
	}


