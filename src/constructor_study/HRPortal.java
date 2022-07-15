package constructor_study;

public class HRPortal 
{

	// Name,Email id-->1224,TM1234,Salary,Position-->QA,DEV,MAN,HR,Gender-->M,f
	
	String Emp_Name;
	int Emp_ID;
	float Emp_Sal;
	String Emp_Position;
	char Emp_Gender;
	
	public void emp_Info()
	{
		System.out.println("=====================================");
		System.out.println("EMP Name is "+Emp_Name);
		System.out.println("EMP id is "+Emp_ID);
		System.out.println("EMP Salary is "+Emp_Sal);
		System.out.println("EMP Position is "+Emp_Position);
		System.out.println("EMP Gender is "+Emp_Gender);
		System.out.println("=====================================");	
		
	}

}
