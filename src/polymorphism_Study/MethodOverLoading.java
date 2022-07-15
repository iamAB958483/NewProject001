package polymorphism_Study;

public class MethodOverLoading {

	public static void main(String[] args) 
	{
		 MethodOverLoading mo= new  MethodOverLoading ();  //created object of class
		 mo.add();
		 mo.add(200,350);
		 mo.add(23.96f,15.78f);
		 
	}
	
	public void add()  //method with zero parameter
	{
		int a=70;
		int b=58;
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
	public void add(int a, int b)  //method with two parameter
	{
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
	public void add(float a, float b)
	{
		double sum=a+b;
		System.out.println("Sum is "+sum);
	}

}
