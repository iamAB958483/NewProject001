package arrayStudy;

public class IntArray {

	private static int i;

	public static void main(String[] args) {
		
		//10
	
		int arr[]= new int[10];
		arr[0]=1;
		
		   int ar[]= {1,2,3,4,5,6,7,8};
		   System.out.println(ar.length);
		   
		   for(int i=0;i<=ar.length-1;i++)
		   {
			   System.out.println(ar[i]);
		   }
		   
		   String city[]= {"Shahada","Nandurbar","Dhule"};
		   
		   for(int i=city.length-1;i>=0;i--)
		   {
			  System.out.println(city[i]);   
		   }
		   
		   String name[]= {"tijihba"};
		   
		   for(int i=name.length-1;i>=0;i--)
		   {
			   System.out.println(name[i]);
		   }
		
		
		
		
	}

}
