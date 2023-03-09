package BasicsOfJava;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// Loops - to avoid writing repetitive code again and again 
		// disadvantage of while loop : if you will not give the incremental/decremental part while loop will generate infinite loop
// 1. while loop
		
		int i =0; // Initialization
		
		while(i<10) {  // conditional part
			System.out.println(i);
			i =i+1; // incremental/decremental part
		}
		System.out.println("*******************");
		
//2. for loop 
		//j++ = j+1
		
		for(int j=1 ; j<=10; j++)
		{
			System.out.println(j);
			
		}
		
		// 10, 9, 8,7,5,4,3,2,1
		System.out.println("*******************");
		for(int k=10; k>=-10; k--)
		{
			System.out.println(k);
		}
		
		

	}

}
