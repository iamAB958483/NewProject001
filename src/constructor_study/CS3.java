package constructor_study;

public class CS3 {

	// With parameter constructor
	
	int p;
	int q;
	int r;
	
	public CS3()  // Without parameter constructor
	{
		p=60;
		q=70;
		r=80;
	}
	
	public CS3(int x)  //With parameter constructor
	{
		p=x;   // default value is 0
	}
	
	public CS3(int x, int y)   //With parameter constructor
	{
		p=x;
		q=y;
	}
	
	public CS3(int x, int y, int z)   //With parameter constructor
	{
		p=x;
		q=y;
		r=z;
	}
	
	
	
	public static void main(String[] args) 
	{
	    CS3 c3= new CS3();              // while creating this object--->calling without parameter constructor
	    c3.sum();
	    
	    CS3 c4= new CS3(100);           //while creating this object--->calling single parameter constructor
	    c4.sum();
	    
	    CS3 c5= new CS3(200,300);       //while creating this object--->calling single parameter constructor
	    c5.sum();
	    
	    CS3 c6= new CS3(400,500,600);  //while creating this object--->calling single parameter constructor
	    c6.sum();
	}
	
	public void sum()
	{
		int sum=p+q+r;
		System.out.println("Sum is "+sum);
	}

}
