package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetStudy {

	public static void main(String[] args) {
		
	
		LinkedHashSet lhs= new LinkedHashSet();
		
		
		lhs.add(3654);
		lhs.add("Velocity");
		lhs.add("XYZ");
		lhs.add(null);
		lhs.add(1000);
		lhs.add("Dhule");
		lhs.add("Nandurbar");
		
		System.out.println(lhs);
		
		lhs.remove(1000);
		System.out.println(lhs);
		
        System.out.println(lhs.size());
		
		System.out.println(lhs.contains("XYZ"));  //True
		

		System.out.println(lhs.contains('Z'));  //False
		
	    System.out.println(lhs.isEmpty());
	    
	     Iterator it = lhs.iterator();
	     while(it.hasNext())
	     {
	    	 System.out.println(it.next());
	     }
	    
	     
	     for(Object w:lhs)
	     {
	    	 System.out.println(w);
	     }
	     
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
