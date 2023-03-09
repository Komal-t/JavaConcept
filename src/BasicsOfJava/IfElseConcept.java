package BasicsOfJava;

public class IfElseConcept {

	public static void main(String[] args) {
		
		
		int a = 30;
		int b = 20;
		
		if(b>a)
		{
			System.out.println("b is greater than a");
		}
		else {
			
			System.out.println("a is greater than b");
		}
			
		
		// comparison operator 
		// < > = <= >= == !=
		
		int c = 80;
		int d = 40;
		
		if (c==d) {
			System.out.println("Value of c and d are equal");
		}
		else {
			System.out.println("Value of c and d are not equal");
		}

		
	 // write a logic to find out the highest number
		int a1 = 400;
		int b1 = 500;
		int c1 = 300;
		
		// nested if-else
		
		if(a1>b1 & a1>c1) // false and false = false , true and true = true, false and true = false
		{
			System.out.println("a1 is greatest number");
		}
		else if(b1>c1){
			System.out.println("b1 is the greatest");
			
		}
		else {
			System.out.println("c1 is the greatest");
		}
		
		

	}

}
