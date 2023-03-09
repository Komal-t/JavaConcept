package BasicsOfJava;

public class ArrayConcept {

	public static void main(String[] args) {
	 // Array , where we store similar datatype values
		
		// lower bound / index of array is 0
		// uper bound / index of array is (n-1) where n is the size of array
		// one dimensional array [1-D array]
		// disadvantage - 1st iss size is fixed // static array
		
		
		
    
       int i [] = new int[4];
       i[0] = 10;
       i[1] = 20;
       i[2] = 30;
       i[3] = 40;
       
       System.out.println(i[3]);
     //   System.out.println(i[4]);
       
       System.out.println(i.length);
       
       //print all the values of array - use loop concept
       
       for(int j=0; j<i.length; j++)
       {
    	   System.out.println(i[j]);
       }
       
    double d[] = new double[3];
    d[0] = 10.12;
    d[1] = 11.15;
    d[2] = 12.30;
    
    System.out.println(d[2]);
    		
    	
    }
	}


