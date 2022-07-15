package accessModifiers_study;

public class DefaultUse {

	int a=10;
	public int b=20;
	private int c=30;
	
	
	public static void main(String[] args) 
	{
		DefaultUse du= new DefaultUse();  //create object of a class
		du.test1();  //calling public method
		du.test2();  //calling default method 
		du.test3();  //calling private method
		
		System.out.println("calling default variable "+du.a);  //calling default variable,accessible within package
		System.out.println(du.b);  //calling public variable,accessible within project
		System.out.println(du.c);  //calling private variable,accessible within same class
	}
	
	public void test1()  //public method,accessible within project
	{
		System.out.println("Hi i am public Test1 method");
	}
	
	void test2()  //default method,accessible within package
	{
		System.out.println("Hi i am default Test2 method");
	}
	
	private void test3()  //private method,accessible within same class
	{
		System.out.println("Hi i am private Test3 method");
	}

}
