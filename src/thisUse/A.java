package thisUse;

public class A {
	
	int a=490;  //global value of a

	public static void main(String[] args) 
	{
		
		
	}
	
	public void Test1()
	{
		int a=90;  //local value of a
		int sub=900-a;  //using local value of a
		int sub1=900-this.a;  //using global value of a
		  
		
	}

}
