package abstractClass_Study;

public class Abstract_demo1 {

	public static void main(String[] args) 
	{
		// as we can not created object of abstract class
		// creating object of concrete class 
		
		ConcreteUse cu= new ConcreteUse();
		cu.test1();  //method complete in Abstract class
		cu.test2();  //method complete in Abstract class
		cu.test3();  //method complete in Abstract class--->has empty body
		cu.test4();  //method complete in Concrete class
		cu.test5();  //method complete in Concrete class--->own method
		

	}
	
	public void test1() // method declaration
	{
		System.out.println("Hi I am test 1 ");  //method body 
	}
	
	public void test2() // method declaration
	{
		System.out.println("Hi I am test 2 ");  //method body 
	}
	
	public void test3() // method declaration
	{
		System.out.println("Hi I am test 3 ");  //method body 
	}
	
	public void test4() // method declaration
	{
		System.out.println("Hi I am test 4 ");  //method body 
	}
	
	
	//change method as a abstract method , class need to do as Abstract




}
