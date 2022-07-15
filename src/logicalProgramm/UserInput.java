package logicalProgramm;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		// a And b Addition
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a= sc.nextInt();
		
		System.out.println("Enter Value of b");
		int b= sc.nextInt();
		
		
		
		int sum=a+b;
		System.out.println("Addition is "+sum);
		

	}

}
