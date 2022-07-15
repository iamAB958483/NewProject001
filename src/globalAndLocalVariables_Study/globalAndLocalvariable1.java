package globalAndLocalVariables_Study;

public class globalAndLocalvariable1 {
	
	int p=20;  // Global Non-static variable 
	int q=30;  // Global Non-static variable
	static int r=40;  // Global static variable
	

	public static void main(String[] args) 
	{
		globalAndLocalvariable1 g= new globalAndLocalvariable1();
		g.Test();  // calling Non-Static method using object
		
		Test1();  // calling Static method of same class
		
		System.out.println("value of p is "+g.p);  // calling Non-static global variable from same class
		System.out.println("value of q is "+g.q);  // calling Non static global variable from same class
		System.out.println("value of r is "+r);    // calling Static global variable from same class
		
		int addition=100+g.p;  //  Using Non-static global variable from same class
		System.out.println("addition is "+addition);
		
		Sample.Display1();  // calling static method from another class---> classname.methodname()
		
		Sample s= new Sample();  // calling Non static method from another class using create object
		s.Display();
		
		System.out.println("Value of m is "+s.m);  //calling Non static global variable from another class
		System.out.println("Value of n is "+Sample.n);  // calling Static global variable from another class
		
		int sub=100-s.m;  // using Non-static global variable from another class
		int mul=10*Sample.n;  // using static global variable from another class
		
		int sub1=sub+mul+Sample.n-s.m;
		System.out.println(sub1);
		
		
	}
	
	public void Test()  // Non-static method
	{
		int mul=p*q;  //   mul Local Variable
		System.out.println("Multipication is "+mul);
	}
	
	public static void Test1()  // Static Method
	{
		int sum=10+r;  // sum is local variable
		System.out.println("Addition is "+sum);
	}

}
