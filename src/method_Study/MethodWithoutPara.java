package method_Study;

public class MethodWithoutPara {

	public static void main(String[] args) 
	{
		MethodWithoutPara mt= new MethodWithoutPara();  //object created
		mt.result();
		studentInfo();
		
	}

	public void result()
	{
		int sub1=89;
		int sub2=90;
		int sub3=77;
		
		int total=sub1+sub2+sub3;
		int avg=total/3;
		System.out.println("My result is "+avg);
	
	}
	
	
	public static void studentInfo() //method without parameter/argument
	{
		//Name,Roll No.,Mob.,Age,Batch,Gender
		
		String name="Abhijit";
		int rollNum=11;
		String Mob="9552248483";
		float Age=27;
		int Batch=03;
		char Gender='M';
		
		System.out.println("My Name is "+name);
		System.out.println("My Roll No is "+rollNum);
		System.out.println("My Mobile No "+Mob);
		System.out.println("My Age is "+Age);
		System.out.println("My Batch is "+Batch);
		System.out.println("My gender is "+Gender);
		
	}
}
