package BasicsOfJava;

public class B extends A {
	
	// super keyword is used to call parent constructor;
	public B(){
		super(10, 20);
		System.out.println("Child class constructor");
	    }
	

	public static void main(String[] args) {
		
		B obj = new B();
	
		


	}

}
