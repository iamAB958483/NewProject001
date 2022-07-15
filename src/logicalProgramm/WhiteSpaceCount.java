package logicalProgramm;

public class WhiteSpaceCount {

	public static void main(String[] args) 
	{
		String str="ABHIJIT";
		String str1="A B H I J I T";  // int count=0,1,2,3
		int count=0;
		for(int i=0;i<=str1.length()-1;i++)
		{
			char space=' ';
			char myChar=str1.charAt(i);
			
			if(myChar==space)
			{
				count++;
			}
			System.out.println("Number of WhiteSpace in given String is "+count);
		}	

	}

}
