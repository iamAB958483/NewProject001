package logicalProgramm;

public class MissingNumberFromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,10};
		int sum1=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum1=sum1+a[i];
		}
		
		System.out.println("Addition of Present Array "+sum1);
		
		
		int sum2=0;
		for(int i=1;i<=10;i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println("Addition of Digit 1 to 6 "+sum2);
		
		int missingNumber=sum2-sum1;
		System.out.println("Missing Number in Array is "+missingNumber);

	}

}
