package JavaFeb2020;

public class Functions {

	// Cannot create a function inside a function
	// Data members of class = Class variables and methods
	// 1.Simple function = No input, no return

	public void test() {
		System.out.println("test");
	}
	// 2. No input but some return
	// Void - Cannot return anything

	public int getNum() {
		System.out.println("get number");
		int a = 2;
		int b = 3;
		int c = a + b;
		return c;

	}

	public String getTrainername() {
		System.out.println("get Trainer name");
		String s = "Naveen";
		return s;

	}

	// 3.Some input and Some return = Tell about input parameters
	// Generic method
	public int sum(int a, int b) {
		System.out.println("sum method");
		int z = a + b;
		return z;
	}
//First write return marks at all places and then remove.....have it only in else part
	public int getMarks(String StudentName) {
		System.out.println("Get marks");
		int marks = -1;

		if (StudentName.equals("Sandy")) {
			marks = 99;
		}

		else if (StudentName.equals("Roshini")) {
			marks = 100;
		}

		else {
			System.out.println("Student Name not found" + StudentName);
		}
		return marks;
	}
	
	
//Give assignment to write a program to launch chrome,FF,IE	
	
	
	
	
	
	

	public static void main(String[] args) {
		// 1st method output
		Functions obj = new Functions();
		obj.test();

		// 2nd method output = First tell RHS and then give it to int and then example
		// of string
		int num = obj.getNum();
		System.out.println(num);
		// Another way of calling and printing is given below
		System.out.println(obj.getNum());

		String s1 = obj.getTrainername();
		System.out.println(s1);
		System.out.println(obj.getTrainername());

		// Call the function = Arguments
		int sum1 = obj.sum(10, 20);
		System.out.println(sum1);

		int sum2 = obj.sum(180, 250);
		System.out.println(sum2);
		
		int score = obj.getMarks("Sandy");
		System.out.println(score);
		
		
	}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	

