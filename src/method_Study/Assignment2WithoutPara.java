package method_Study;


public class Assignment2WithoutPara {

	public static void main(String[] args) 
	{
		Assignment2WithoutPara wp= new Assignment2WithoutPara();   //create object for...... BatchInfo
		wp. BatchInfo();
		BatchInfo1();
		
		Without_para  w_p =new Without_para();   //create object for......MathOperation
		w_p.MathOperation();
		
	}

	
	      //Name,District,Branch,Percentage
	
	
	  public void BatchInfo() // WithoutPara
	  {
		 String Name="Abhijit";
		 String District="Nandurbar";
		 String Branch="E&Tc";
		 float Percentage=65.36f;
		 
		 System.out.println("****************BatchInfo********************");
		 System.out.println("My Name is "+Name);
		 System.out.println("My District is "+District);
		 System.out.println("My Branch is "+Branch);
		 System.out.println("My Percentage is "+Percentage);
				
	  }


	     //Name,District,Branch,Percentage
	    
	   public static void BatchInfo1()
	    {
	    	
	    	 String Name="Bhamare";
			 String District="Shahada";
			 String Branch="Mechanical";
			 float Percentage=82.345f;
			 
			 System.out.println("**********************************************");
			 System.out.println("My Name is "+Name);
			 System.out.println("My District is "+District);
			 System.out.println("My Branch is "+Branch);
			 System.out.println("My Percentage is "+Percentage);
			 System.out.println("#################################################");		
	    }
	  


	      //Addition,Subtraction,Multiplication,Division
	    
	    public void MathOperation()   //WithoutPara
		  {
			  
			  int a=400;
			  int b=200;
			  
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


