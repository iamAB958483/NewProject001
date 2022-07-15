package accessTest;

import accessModifiers_study.DefaultUse;

public class Test {

	public static void main(String[] args) {

		DefaultUse du= new DefaultUse();  //create object of another class
		
		du.test1();  //calling public method,visible within project
      //du.test2();  //calling default method,visible within package
	  //du.test3();  //calling private method,visible within same class
		
	  //System.out.println("Calling Default variable "+du.a);  //calling default variable,accessible within package
		System.out.println(du.b);  //calling public variable,accessible within project
	  //System.out.println(dc.c);  //calling private variable,accessible within same class
		
		
	}

}
