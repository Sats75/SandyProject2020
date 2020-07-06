package JavaFeb2020;

public class IncandDecOperators {

	public static void main(String[] args) {

		int x=1;
		int y=x++;
		System.out.println(x);
		System.out.println(y); //Post increment...first give value of x to y and then inc the value of x & give it x
		
		int p= -1;
		int q= p++;
		
		System.out.println(p);
		System.out.println(q);
		
		int a= 1;   //Pre increment - 1st increase the value of a and give it to b
		int b = ++a;
		System.out.println(a); //2
		System.out.println(b);  //2
		
		int h = -1;
		int g=++h;
		System.out.println(h);
		System.out.println(g);

		//Post decrement  - First give value to m and then decrease the value
		int m=2;
		int n= m--;  
		System.out.println(m);  //1
		System.out.println(n);  //2

		//Pre decrement
		
		int k=-3;
		int l= --k;  
		System.out.println(k);  //-4
		System.out.println(l);  //-4
		
		
		
		
		
		
		
	}

}
