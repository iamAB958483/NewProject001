package patternProgramm;

public class Example2 {

	public static void main(String[] args) {
		
		//* * * * *
		//* * * * *
		//* * * * *

		//Rows----->3(Outer For Loop)
		//Column---->5(Inner For Loop)
		
		for(int i=1;i<=3;i++)    //For Rows
		{
			for(int j=1;j<=5;j++)  //For Column
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
