package sparksport.co.nz;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		method1();
		System.out.println("Main Ended");
		
	}

	private static void method1() {
		method2();
		System.out.println("Maithed 1 Ended");
	}

	private static void method2() {
		String str = null ;
		str.length();
		System.out.println("Maithed 2 Ended");
	}

}
