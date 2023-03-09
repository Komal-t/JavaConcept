package BasicsOfJava;

public class ConstructoirWithThisKeyword {
	
	String name;
	int age ;
    String Collage;
    static int model;
	
	
	public ConstructoirWithThisKeyword(String name , int age) {
		
		this.name = name;
		this.age = age ;
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		ConstructoirWithThisKeyword obj = new ConstructoirWithThisKeyword("Koma" , 25);
		obj.Collage = "Radhe";
		model = 2023;
		model = 90;
		System.out.println(model);
	    System.out.println(obj.Collage);
		
			
		}
       

	}


