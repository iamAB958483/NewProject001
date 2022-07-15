package logicalProgramm;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int h=16761;
		int a=h;
		int r=0;
		
		while(h!=0)
		{
			r=r*10+h%10;
			h=h/10;
		}
		
		System.out.println(r);
		
		if(a==r)
		{
			System.out.println(r+" This is Palindrome Number");
		}
		else
		{
			System.out.println(r+" This is Not Palindrome Number");
		}
	}

}
