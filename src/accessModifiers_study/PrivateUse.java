package accessModifiers_study;

public class PrivateUse 
{
	public int a=100;  // Non static global variable---->public
	public int b=200;  //Non static global variable----->private

	public static void main(String[] args) 
	{
		PrivateUse pu =new PrivateUse();  //create object of class
		pu.Test1();  //calling private method in same class
		pu.Test();  //calling public method in same class
		
		System.out.println("pu.a");  //calling public global variable
		System.out.println("pu.b");  //calling private global variable
	}
	
	public void Test()
	{
		System.out.println("This is Public Test Method");
	}
	
	private void Test1()
	{
		System.out.println("This is Private Test Method");
	}
	

}
