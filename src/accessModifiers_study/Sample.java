package accessModifiers_study;

public class Sample {

	public static void main(String[] args) 
	{
		DefaultUse du1= new DefaultUse();  //create object from another class
		du1.test1();  //calling public method from another class
		du1.test2();  //calling default method from another class
		//du1.test3();  //can not call private methods from another class
		
		System.out.println(du1.a);  //calling public method from another class
		System.out.println(du1.b);  //calling default method from another class
		//System.out.println(du1.c);  //can not call private methods from another class

	}

}
