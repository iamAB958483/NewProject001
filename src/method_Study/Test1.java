package method_Study;

public class Test1 {

	public static void main(String[] args) 
	{
		
		method1();          // calling static method from same class--> only method name();
		Test2.myMethod();  // calling static method form another class--> classname.Methodname();
		
		// to call non static method --> we need object
		// className objectName=new ClassName();
		 
		Test1 t= new Test1(); //created object--> t
		//to call non static method using object--> objectName.methodName
		
		t.method2(); // calling non static method from same class
		// to call non static method from another,we need object of that class
		
		
		Test2 m= new Test2(); // created object of another class
		m.myMethod1(); // calling Non Static method from another class
		
		
	}
    
	public static void method1() // static method
	{
		
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}

	public void method2() //non static method
	{
		int a=90;
		int b=10;
		int sub=a-b;
		System.out.println("Substraction is "+sub);
	}



}

