package method_Study;

public class MethodWithPara {

	public static void main(String[] args) 
	{
		MethodWithPara mp= new MethodWithPara();  //create object
		
		mp.StudentInfo("Abhijit",11,"9552248483",27,03,'M');
		
		//mp.StudentInfo("velocity",10,"123654789",99,7,'F');
		
		//mp.StudentInfo("Sumit", 11, "123654789", 11, 12, 'M');
			
	}

	// Name,Roll No.,Mob.,Age,Batch,Gender
	

	public void StudentInfo(String name, int rollNum,String Mob,float Age,int Batch,char Gender) //Method With Parameter
	{
		System.out.println("My Name is "+name);
		System.out.println("My Roll No is "+rollNum);
		System.out.println("My Mobile No "+Mob);
		System.out.println("My Age is "+Age);
		System.out.println("My Batch is "+Batch);
		System.out.println("My gender is "+Gender);
		
	}
}
