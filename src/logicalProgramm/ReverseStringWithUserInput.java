package logicalProgramm;

import java.util.Scanner;

public class ReverseStringWithUserInput {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please Enter String Value");
		
		String a= sc.next();
		
		String rev="";
		
		int l=a.length();
		
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		
		System.out.println("Reverse String is "+rev);
		
		
		if(rev.equals(a))
		{
			System.out.println(rev+" This is Palindrome String");
		}
		else
		{
			System.out.println(rev+" This is Not Palindrome String");
		}
		
	}

}
