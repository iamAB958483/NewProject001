package method_Study;

public class Test3 {

	public static void main(String[] args) {
		
		method1();             // calling static method from same class
		Test4.myMethod();     //  calling static method from another class
		
		
		Test3 t=new Test3(); // calling Non-Static method from same class
		t.method2();
		
		Test4 m=new Test4();  // calling Non-Static method from another class
		m.myMethod1();
}
	
	public static void method1()    // Static Method
	{
		int a=40;
		int b=60;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
    
	public void method2()         // Non-Static Method
	{
		int a=100;
		int b=90;
		int sub=a-b;
		System.out.println("Substraction is "+sub);
	}
}
