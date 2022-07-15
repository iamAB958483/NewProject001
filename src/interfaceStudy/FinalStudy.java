package interfaceStudy;

public class FinalStudy {

	public static void main(String[] args) {
		
		int a=90;  //Default
		System.out.println("Initial value of a is  "+a);
		
		a=a+10;  //Adding 10 in original value 
		System.out.println("Updated value of a is "+a);
		
		final int b=80;
		//b=b+10;
	}
	
	public void Test()
	{
		System.out.println("I am Test method from FinalStudy class");
	}
	
	final public void Test1()
	{
		System.out.println("I am Test1 method from FinalStudy class");
	}

}
