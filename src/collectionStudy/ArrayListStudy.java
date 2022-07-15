package collectionStudy;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		//ArrayList<String>as=new ArrayList<String>();
		
		
		ArrayList al=new ArrayList();
		
		al.add("Abhijit");
		al.add(1234);
		al.add('A');
		al.add(123.12);
		al.add(0);
		al.add(null);
		al.add("B");
		System.out.println(al);
		
		System.out.println(al.get(2));
		System.out.println(al.get(5));
		System.out.println(al.get(6));
		
	//	System.out.println(al.get(8));
		
		al.add(1,"Shahada");  //Add element at perticular index
		System.out.println(al);
		
		al.remove(5);  //Remove element at perticular index
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.contains('A'));  //True
		

		System.out.println(al.contains('Z'));  //False
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.indexOf(null));
		
		
		System.out.println(al.indexOf('A'));
		
		System.out.println(al.lastIndexOf("Shahada"));
		
		System.out.println(al.lastIndexOf("abc"));
		
		
		
		//Moving through list using for Loop
		
		System.out.println("========For Loop========");
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("=========================================");
		
		
		//Moving through list using curser------->iterator
		
		System.out.println("================Using Curser>>>>>Iterator=======================");
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("==============================================");
		
		
		//Moving through list using curser---->Listiterator
	
	
	     ListIterator itl = al.listIterator();
	     System.out.println("================Using Curser>>>>>ListIterator=======================");
	     while (itl.hasNext())	 
	    {
	         System.out.println(itl.next());
       	}
	     
	    System.out.println("=================");
	
	    for(Object w:al)
	    {
	        System.out.println(w);
	    }
	    System.out.println("=================");
	    
		
	
	}
		
		
}




