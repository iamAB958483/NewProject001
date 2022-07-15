package arrayStudy;

public class CharArray2 {

	public static void main(String[] args) {
	
		//a b c d e f
		char arr[]= new char[4];
		arr[0]='a';
		arr[1]='b';
	    arr[2]='c';
	    arr[3]='d';
       // arr[4]='e';
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
       
        
        System.out.println("===================================");  //static coding
        for(int i=0;i<=3;i++)
        {
        	System.out.println(arr[i]);
        }
        
        System.out.println("====================================");  //Dynamic coding
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	
	}

}
