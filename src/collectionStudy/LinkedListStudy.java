package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		
        LinkedList ll= new LinkedList<>();
		
		ll.add("Mumbai");
		ll.add('H');
		ll.add(null);
		ll.add(null);
		ll.add("Nagpur");
		ll.add(12312364);
		ll.add(99.89);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains("Pune"));
		System.out.println(ll.remove(5));
		System.out.println(ll.get(5));
		
		
		Iterator it = ll.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
		
		for(Object u:ll)
		{
			System.out.println(u);
		}
		
		
		  ListIterator itl = ll.listIterator();
		  System.out.println("================Using Curser>>>>>ListIterator=======================");
		  while (itl.hasNext())	 
		  {
		     System.out.println(itl.next());
	      }
		     
		  System.out.println("=================");
		  
		  
			Iterator it2 = ll.iterator();
			
			while (it2.hasNext())
			{
			System.out.println(it2.next());	
			}
			
		  
		  
		  
		  
		  
		  
		
	}

}

