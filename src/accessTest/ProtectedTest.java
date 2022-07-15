package accessTest;

import accessModifiers_study.ProtectedUse;

public class ProtectedTest extends accessModifiers_study.ProtectedUse {


	public static void main(String[] args) {
		
		ProtectedTest p= new  ProtectedTest();  
		p.Display4(); //can call only public method
		// To make use of protected,created object of subclass(protected Test)
		
		ProtectedTest pt= new ProtectedTest();  //created object of sub class
		
		//pt.Display1();  //can not call private method in another class or package
		//pt.Display2();  //can not default method,default is accessible within same package 
		pt.Display3();  //calling protected method from another package with in the help of inheritance concept
		pt.Display4();  //calling public method,accessible within project
		
		//System.out.println(pt.a);  //can not call private method in another class or package
		//System.out.println(pt.b);  //can not default method,default is accessible within same package 
          System.out.println(p.c);  //calling protected method from another package with in the help of inheritance concept
          System.out.println(p.d);  //calling public method,accessible within project
		
	}

}
