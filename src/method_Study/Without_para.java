package method_Study;

public class Without_para {

	public static void main(String[] args) 
	{
		Without_para  wp =new Without_para();   //create object
		wp.MathOperation();
		

	}
	
	  //Addition,Subtraction,Multiplication,Division
	
	  public void MathOperation()   //MethodWithoutParameter
	  {
		  
		  int a=40;
		  int b=14;
		  
		  int sum=a+b;
		  int sub=a-b;
		  int mul=a*b;
		  int div=a/b;
		  
		  System.out.println("**********Math Operation************");
		  System.out.println("Addition "+sum);
		  System.out.println("Subtraction "+sub);
	   	  System.out.println("Multipication "+mul);
		  System.out.println("Division "+div);
	  }  
}
	  
