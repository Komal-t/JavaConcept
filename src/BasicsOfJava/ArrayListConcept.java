package BasicsOfJava;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {


		ArrayList ar = new ArrayList();
		
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("Komal");
		ar.add("Nav");
		ar.add("12.33");
		ar.add("M");
		ar.add(600); //9
		
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(8));
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(900);
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Aadi");
		
		
		
		
		

	}

}
