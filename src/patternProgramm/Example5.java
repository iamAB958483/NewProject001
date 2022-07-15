package patternProgramm;

public class Example5 {

	public static void main(String[] args) {
		
		
//	     
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		
		//For Rows----->5  
	    //For Column---->5
		//Space=0
		//Star=5
		
		
		int space=0;
		int star=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			star--;
			space++;
		}
	}

}


