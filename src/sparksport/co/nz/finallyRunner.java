package sparksport.co.nz;

import java.util.Scanner;

public class finallyRunner {


	public static void main(String[] args) {
		
		Scanner scanner = null;
		
		try {
		
		scanner = new Scanner(System.in);
		int[] numbers = {1,2,3,4,5};
		
		int number = numbers[5];
		
		
	
		} catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("Before scanner is cling out");
			
		} finally {
			scanner.close();
			System.out.println(" scanner is closed");
			
		}
		

		
	}

}
