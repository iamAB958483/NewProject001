package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) {
		
		TreeSet ts= new TreeSet();
		
		ts.add("Abhijit");
		ts.add("Bhamare");
		ts.add("Jaipur");
		ts.add("Nashik");
		ts.add("Jalgoan");
		ts.add("Mumbai");
		ts.add("Amazon");
		ts.add("XYZ");
		
		System.out.println(ts);
		
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
			
		for(Object a:ts)
		{
			System.out.println(a);
		}
			
		
		
		
		
		

	}

}
