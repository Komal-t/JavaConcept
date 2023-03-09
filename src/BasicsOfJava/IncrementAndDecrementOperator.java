package BasicsOfJava;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
           // i++ , i--
		
		int i = 1;
		int j = i++; // post increment
		
		System.out.println("Value of i is "+i);
		System.out.println("Value of j is " +j);
		
		int a =1;
		int b = ++a; // pre increment
              
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is " +b);
		
		int m = 2;       // post increment
		int n = m--;
		
		System.out.println("Value of m is " +m);
		System.out.println("Value of n is " +n);
		
		int x = 2;
		int y = --x;           // pre decrement
		
		System.out.println("Value of m is " +x);
		System.out.println("Value of n is " +y);
		
		
	}

}
