package patternProgramm;

public class Example7 {

	public static void main(String[] args) {
		// *******
		//  *****
		//   ***
		//    *

		//Row---->4 Column---->7
		//Space---->0 Star---->7
		
		int star=1;
		int space=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("");
			}
			
			for(int k=1;k<star;k++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
			star++;
			space--;
		}
		
		
		
		
	}

}
