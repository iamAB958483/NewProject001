package interfaceStudy;

public class MyClass implements MyInterface {

	public static void main(String[] args) 
	{
		MyClass m = new MyClass();// created object of implementation class
		m.Test3();
		m.Test4();
		m.Test5();
		System.out.println(a);
		

	}

	@Override
	public void Test3() 
	{
		System.out.println("Hi this method completed in Implementation classs");
		
	}

	@Override
	public void Test4()
	{
		System.out.println("Hi this method completed in Implementation classs");
	}
	
	public void Test5()
	{
		System.out.println("This method is from Myclass");
	}

}
