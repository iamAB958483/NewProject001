package logicalProgramm;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter String");
		String orignal=sc.next();
		String rev="";
		
		for(int i=orignal.length()-1;i>=0;i--)
		{
			rev=rev+orignal.charAt(i);
		}
		
		System.out.println("Reverse String is "+rev);
		
		
		if(orignal.equals(rev))
		{
			System.out.println("This String is Palindrome");
		}
		else
		{
			System.out.println("This String is Not Palindrome");
		}
		

	}

}
