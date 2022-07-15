package thisUse;

public class B extends A
{
	int a=800;

	public static void main(String[] args) 
	{
		B b= new B();  //create subclass object
		b.Sample();
	}
	
	public void Sample()
	{
		int a=10;
		
		int sum1=a+10;//Local value of a
		System.out.println("Sum1 value is used local variable "+sum1);
		
		int sum2=this.a+10;  //global value of a
		System.out.println("Sum2 value is used global variable from same class "+sum2);
		
		int sum3=super.a+10;  //global value of a from super class
		System.out.println("Sum3 value is used global variable from super class "+sum3);
		
		
	}

}
