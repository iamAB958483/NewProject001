package collectionStudy;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueStudy {

	public static void main(String[] args) {
		
		
		PriorityQueue pq= new PriorityQueue<>();
		
		pq.add("Abhijit");
		pq.add("Rajendra");
		pq.add("Bhamare");
		pq.add("From");
		pq.add("Shahada");
		pq.add("District");
		pq.add("Nandurbar");
		
		System.out.println(pq);
		
		System.out.println(pq.element());
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
//		
//		Iterator it = pq.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//			
//		}
//		
//		for(Object c:pq)
//		{
//			System.out.println(c);
//		}
	}

}
