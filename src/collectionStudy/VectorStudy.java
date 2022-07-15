package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector v= new Vector<>();
		
		v.add("9552248483");
		v.add("Nandurbar");
		v.add(true);
		v.add('A');
		v.add("Abhijit");
		v.add("Bhamare");
		
		System.out.println(v);

		v.add(3,"India");
		System.out.println(v);
 
		v.remove(4);
		System.out.println(v);
		
		System.out.println(v.contains("India"));
		System.out.println(v.size());
		
		System.out.println("=============================");
		
		for(Object b:v)
		{
		  System.out.println(b);
		}
		System.out.println("===============");
		
		Iterator it = v.iterator();
		while (it.hasNext())
		{
	     	System.out.println(it.next());
		}
		System.out.println("===============");
		
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
		   System.out.println(en.nextElement());
		}
		
		
	}
	

}
