package controlStatementStudy;

public class NestedIfElseStudy {

	public static void main(String[] args) {
		//if User Name is correct--->Enter Password, else please check User Name 
        //if Password is correct--->Login Success,else Invalid Password
		
		String UserName="ABHIJIT";
		String Password="@12345";
		
		if("ABHIJIT"==UserName)
		{
			System.out.println("UserName is correct,Please enter password");
		
		
		   if("@12345"==Password)
		   {
			   System.out.println("Login Successful");
		   }
		   else
		   {
			   System.out.println("Invalid Password");
		   }
		   
		}
		
	    else
		 {
			 System.out.println("Please enter correct UserName");
		 }
		   
		
	}

}
