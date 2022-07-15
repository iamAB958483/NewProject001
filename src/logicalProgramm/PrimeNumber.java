package logicalProgramm;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a=7;
		int count=0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
			
		}
		
		if(count==0)
		{
			System.out.println("Number "+a+" is prime Number");
		}
		else
		{
			System.out.println("Number "+a+" is Not Prime Number "+a);
		}
	}

}
