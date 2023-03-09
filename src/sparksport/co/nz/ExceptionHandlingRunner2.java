package sparksport.co.nz;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		
		method1();
		System.out.println("Main Ended");
		
	}

	private static void method1() {
		method2();
		System.out.println("Method 1 Ended");
	}

	private static void method2() {
		try {
	//	String str = null ;
	//	str.length();
	    int[] i = {1, 2};
	    int number = i[3];
	    
		System.out.println("Maithed 2 Ended");
		
		} catch(NullPointerException ex) {
			System.out.println("NullPointer Exception matched");
			ex.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBounds Exception matched");
			
		 
	} catch(Exception ex) {
		System.out.println("Exception matched");
			ex.printStackTrace();
		
   }
	}
}
