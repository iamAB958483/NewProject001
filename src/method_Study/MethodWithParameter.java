package method_Study;

public class MethodWithParameter {

	public static void main(String[] args) 
	{
		MethodWithParameter m=new MethodWithParameter(); //created object
		m.addition();
		m.addition1(40,50);
		m.addition1(30,40);

	}

	public void addition() // Method Without Parameters
	{ 
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition is "+sum);

	}
	
	public void addition1(int a,int b) //Method With Parameter
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
}

