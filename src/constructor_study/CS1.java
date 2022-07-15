package constructor_study;

public class CS1 {

	int a;
	int b;
	public static void main(String[] args)
	{
		CS1 c1= new CS1();  //created object of a class
		c1.sum();

	}

	   //CS1()  //user defined constructor created by compiler--> after creating object
 	{
		
	}
	
	    CS1()  //user defined constructor--->zero parameter/without parameter
	{
		a=10;
		b=20;
		
	    System.out.println("Welcome to constructor");
		
	}
	
	 public void sum()
	 {
		 int sum=a+b;
		 System.out.println("Addition is "+sum);
	 }
}
