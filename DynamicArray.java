package JavaFeb2020;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {

		//Object Array
		Object ob[] =  new Object[3];
		ob[0]="Steve";
		ob[1]=25;
		ob[2] = true;
		
		for(int v=0;v<ob.length;v++) {
			System.out.println(ob[v]);
		}
		//Import Array ; Check how dynamically it is increasing the size.
		//Arrayoutofbound exception
		//Default virtual capacity is 10 .

		ArrayList ar = new ArrayList();

	ar.add(100);  //0
	ar.add(200);  //1
	System.out.println(ar.size());
	ar.add(250);  //2
	System.out.println(ar.size());
	ar.remove(2);
	System.out.println(ar.get(0));
	
	//Arraylist with only integer .It is called generics and it will allow only 1 data type
	ArrayList <Integer>markslist = new ArrayList <Integer>();
	markslist.add(10);
	markslist.add(20);
	
	
	ArrayList <String>studentslist = new ArrayList <String>();
	studentslist.add("Tom");
	studentslist.add("Rocky");
	
	//Char also you can try
	
	
		
		
		
		
		
		
		
	}

}
