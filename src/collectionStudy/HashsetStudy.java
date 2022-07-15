package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashsetStudy {

	public static void main(String[] args) {
		
        HashSet hs= new HashSet<>();
		
		hs.add("Velocity");
		hs.add(123);
		hs.add(123);
		hs.add(null);
		hs.add(null);
		hs.add(987);
		hs.add("Pune");
		
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		while (it.hasNext())
		{
		System.out.println(it.next());	
		}
		
		System.out.println(hs.size());
		
		for(Object w:hs)
		{
			System.out.println(w);
		}
		

		
		
	}

}
