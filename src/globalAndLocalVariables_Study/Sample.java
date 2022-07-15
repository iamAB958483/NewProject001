package globalAndLocalVariables_Study;

public class Sample 
{
	int m=120;  // Global Non-static variable
	static int n=140;  //Global static variable
	


	public void Display()
	{
		System.out.println("I am Non static method (Display) from same class ");
	}
	
	public static void Display1()
	{
		System.out.println("I am static method (Display1) fro same class");
	}
	

}
