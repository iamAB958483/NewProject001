package loops_Study;

public class ForStudyLoop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number=1; int temp=0;
		for(int i=2; i<=Number-1; i++)
		{
			if(Number % i == 0 )
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Not Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}
	}
}
