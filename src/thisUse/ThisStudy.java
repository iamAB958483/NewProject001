package thisUse;

public class ThisStudy {
	
	int a=500;  //Global value of a
	int b=120;  //Global value of b

	public static void main(String[] args) 
	{
		ThisStudy ts= new ThisStudy();
		ts.Test1();
		ts.Test2();
	
	}
	
	public void Test1()
	{
		int a=100;  //local value of a
		int sum=a+100;  //default value of a in Test method will be local value
		System.out.println("Sum is "+sum);
		int sum2=this.a+100;  //using this keyword we are calling global variable
		System.out.println("Sum is "+sum2);
	}
	
	public void Test2()
	{
		int b=400;
		int sum=b+10;
		System.out.println("Sum is "+sum);
		int sum2=this.b+10;  //adding global and local value of b
		System.out.println("Sum is "+sum2);
	}
	

}
