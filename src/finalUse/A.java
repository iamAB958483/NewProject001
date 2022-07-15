package finalUse;

import interfaceStudy.FinalStudy;

public class A extends FinalStudy {
	
	public void Test()  //Override the Test method 
	{
		System.out.println("Hi i am Test method from A class");
	}
	
	//public void Test1()  //we can not Override final method
	//{
    //		System.out.println("I am Test1 method from A class");
	//} {

	public static void main(String[] args) {
		
		A a=new A();
		FinalStudy fs=new FinalStudy();
		
		fs.Test();
		a.Test();
		

	}

}
