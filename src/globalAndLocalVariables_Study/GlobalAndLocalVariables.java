
package globalAndLocalVariables_Study;

public class GlobalAndLocalVariables
{
	int a=10;  //Non-static global variables
	int b=20;  //non-static global variables
	static int c=60;  //Static global variables
	static int d=40;  //static global variables

	
	public static void main(String[] args)
    {
		
		GlobalAndLocalVariables gb= new GlobalAndLocalVariables();  // Create Object
		gb.addition();  // calling Non-Static method using object
		
		Substraction(); // calling Static method from same class 

	}
	
	public void addition()   // Non-Static method
	{
		// We can call static and non-static variables in Non-Static Method 
		
		int sum1=a+b;  // Non-Static variables
		int sum2=c+d;  // Static variables
		System.out.println("addition is "+sum1);
		System.out.println("addition is "+sum2);
	}
	
	public static void Substraction()  // static Method
	{
		// We can call only static variables in Static Method
		
		//int sub1=a-b;  // we can not call Non-static variables in Static Method
		int sub2=c-d;  // Calling static variables in static method 
		System.out.println("Substraction is "+sub2);
	}

}
