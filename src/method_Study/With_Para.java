package method_Study;

public class With_Para {

	public static void main(String[] args) 
	{
		
		With_Para wp= new With_Para(); //object Create
	    wp.MathOperation(63,60);  
	}
    
	
	 //Addition,Subtraction,Multiplication,Division
	
	 public static void MathOperation (int a,int b)   //MethodWithParameter
	 
	 {
	
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


