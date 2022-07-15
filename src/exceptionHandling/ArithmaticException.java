package exceptionHandling;

public class ArithmaticException {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int div=0;
		
		System.out.println(a);
		System.out.println(b);
		
		
		try
		{
		   div=a/b;	
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Please check value of b");
		}
		

	}

}
