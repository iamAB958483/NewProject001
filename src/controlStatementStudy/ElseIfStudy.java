package controlStatementStudy;

public class ElseIfStudy {

	public static void main(String[] args) {
		// if marks greater than or equal to 75--->Distinction
		// if marks greater than or equal to 66--->1st Class
		// if marks greater than or equal to 56--->2nd Class
		// if marks greater than or equal to 40--->Pass
		// if marks are less than 40---->fail
		
		
		int Marks=39;
		
		if (Marks>=75)
		{
			System.out.println("You are in Distinction");
		}
		
		else if (Marks>=66) 
		{
			System.out.println("You are in 1st class");
		}
		
		else if (Marks>=56)
		{
			System.out.println("You are in 2nd Class");
		}
		
		else if(Marks>=40)
		{
			System.out.println("You are in Pass");
		}
		
		else
		{
			System.out.println("You are in Fail");
		}
		
	}

}
