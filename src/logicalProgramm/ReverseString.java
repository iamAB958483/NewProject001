package logicalProgramm;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		    String s="ABHIJIT";
		//	System.out.println(s);
			String rev="";
			int l= s.length();
			
			for(int i=l-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
			
			System.out.println("Reverse String is "+rev);

	}

}
