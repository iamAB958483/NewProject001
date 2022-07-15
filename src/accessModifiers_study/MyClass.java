package accessModifiers_study;

public class MyClass {

	public static void main(String[] args) 
	{
		PrivateUse pu1 =new PrivateUse();  //create object of anther class
		pu1.Test();  //calling public method  from another class
	  //pu1.Test1();  //can not call private member from another class,that wont be visible
		
		System.out.println("pu1.a");  //calling public global variable from another class
      //System.out.println("pu1.b");  //can not call private member from another class,that wont be visible
		
	}

}
