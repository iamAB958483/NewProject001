package thisUse;

public class B1 extends A1 {
	
	int a=500;  //global variable of class B

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B1 b= new B1();
		b.Display();

	}
	
	public void Display()
	{
		int a=200;  //local variable
		
		System.out.println("Local value of a is "+a);  //calling local value
		System.out.println("Global value of a from same class is "+this.a);  //calling global value of same class
		System.out.println("Global value of a from same class is "+super.a);  //calling global value of super class

	}

}
