package arrayStudy;

public class IntMultiDimentional {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2},{3,4}};
		
		System.out.print(arr[0][0]+" ");
		System.out.print(arr[0][1]+" ");
		System.out.println();
		System.out.print(arr[1][0]+" ");
		System.out.print(arr[1][1]+" ");
		System.out.println();
		System.out.println("========================");
		
		for(int i=0;i<=arr.length-1;i++)  //Outer for Loop------>for row
		{
			for(int j=0;j<=arr.length-1;j++)  //Inner for Loop------>for column
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
