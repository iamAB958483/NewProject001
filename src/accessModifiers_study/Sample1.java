package accessModifiers_study;

public class Sample1 {

	public static void main(String[] args) {
		
		 ProtectedUse pu= new  ProtectedUse();  //create object from another class
		 //pu.Display1();  //can not calling private method from another class
		 pu.Display2();  //calling default method from another class,accessible within package
		 pu.Display3();  //calling protected method form another class,accessible within package,inheritance
		 pu.Display4();  //calling public method
				
		 //System.out.println(pu.a);  //can not call private member from another class
		 System.out.println(pu.b);  //calling default member from another class
		 System.out.println(pu.c);  //calling protected member from another class
		 System.out.println(pu.d);  //calling public member
	}

}
