package logicalProgramm;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num1=1,num2=2,num3;
		
		System.out.print(num1+" "+num2);
		
		for(int i=0;i<=10;i++)
		{
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}

	}

}
