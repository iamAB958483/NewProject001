package logicalProgramm;

import java.util.Scanner;

public class EvenAndOddNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a ");
		int a=sc.nextInt();
		int b=2;
		
		if(a%b==0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}
	}

}
