package logicalProgramm;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		String a[]= {"Abhijit","Sumit","Yogesh","Swapnil","Priyanka","Neha","Abhijit"};
		boolean value = false;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1
					
					;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Element in Array is :"+a[i]);
					value=true;
				}
			}
		}

		if(value==false)
		{
			System.out.println("No Duplicate Array is Present");
		}
	}

}
