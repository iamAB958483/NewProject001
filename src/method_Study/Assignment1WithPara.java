package method_Study;

public class Assignment1WithPara {

	public static void main(String[] args) 
	{
		Assignment1WithPara w_p= new Assignment1WithPara();        //object create for.....BatchInfo
		
		w_p.BatchInfo("Abhijit","Nandurbar", "E&Tc",65.33);
	
		//wp.BatchInfo("Bhamare","Shahada","Civil",80.65);
		
		
		With_Para wp= new With_Para();    //object Create for.......MathOperation
		MathOperation(72,60); 
		
	}
    
	
	    //Name,District,Branch,Percentage
	
	public void BatchInfo(String Name,String District,String Branch,double d)   //MethodWithPara
	{
        System.out.println("***************BatchInfo********************");
		System.out.println("My Name is "+Name);
		System.out.println("My District is "+District);
		System.out.println("My Branch is "+Branch);
		System.out.println("My Percentage is "+d);
	}
	
	 
	   
      //Addition,Subtraction,Multiplication,Division
	
	public static void MathOperation (int a,int b)   // MethodWithPara
	 
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
