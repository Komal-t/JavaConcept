package BasicsOfJava;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
	
		// in arrayList we have indexes but in Hashtable we have keys
		// put is a method

		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, "200");
		h.put(2, "300");
		
		System.out.println(h.size());
		
		System.out.println(h.get("A"));
		System.out.println(h.get(2));
		
		h.put(3, "Tom");
		System.out.println(h.get(3));
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		
		h1.put(5, 500);
	
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		
		h2.put(6, "Bhola");
	
		
		
		

	}

}
