package constructor_study;

public class Employee {

	public static void main(String[] args) 
	{
		HRPortal MSD=new HRPortal();
		MSD.Emp_Name="MSD";
		MSD.Emp_ID=07;
		MSD.Emp_Position="captain";
		MSD.Emp_Sal=170000000f;
		MSD.Emp_Gender='M';
		
		MSD.emp_Info();
		HRPortal VK=new HRPortal();
		
		
		VK.Emp_Name="VIRAT";
		VK.Emp_ID=18;
		VK.Emp_Position="Vice-Captain";
		VK.Emp_Sal=18000000000f;
		VK.Emp_Gender='M';
		
		VK.emp_Info();
	}

}
