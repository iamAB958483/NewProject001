package constructor_study;

public class CS2 {
	
	// With parameter constructor
	
	int a;// variable declaration
	int b;// variable declaration
	int c;// variable declaration 
	
	public CS2()     // without parameter constructor
	{
		 a=10;
		 b=20;
		 c=30;
		
	}
	
	public CS2(int x)   // with parameter constructor
	{
		a=x;   //  default value--->0
	}
	
	public CS2(int x,int y)   // with parameter constructor
	{
		a=x;  //100
		b=y;  //200
	}
	
	public CS2(int x,int y,int z)   // with parameter constructor
	{
		a=x;
		b=y;
		c=z;
	}
	
	
	public static void main(String[] args) 
	{
		CS2 c2= new CS2();         // while creating the object -->calling without parameter constructor
		c2.sum();
		
		CS2 c3= new CS2(10);       // while creating this object-->calling single parameter constructor
		c3.sum();
		
		CS2 c4=new CS2(150,500);   // while creating this object-->calling single parameter constructor
		c4.sum();
		
		CS2 c5=new CS2(100,2,30);  // while creating this object-->calling single parameter constructor
		c5.sum();
		
		//CS2 c6=new CS2(123,698);
		//c6.sum();

	}
    public void sum()
    {
    	int sum=a+b+c;
    	System.out.println("Sum is "+sum);
    }
}
