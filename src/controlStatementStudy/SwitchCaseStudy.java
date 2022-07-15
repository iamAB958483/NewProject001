package controlStatementStudy;

public class SwitchCaseStudy {

	public static void main(String[] args) {
		// You are BE student
		
		//1--> 1st year Engineer
		//2--> 2nd year Engineer
		//3--> 3rd year Engineer
		//4--> 4th year Engineer
		// Invalid Year
		
		int Year=3;
		
		switch (Year)
		{
		case 1:System.out.println("1st year Engineer");
		break;
		
		case 2:System.out.println("2nd year Engineer");
		break;
		
		case 3:System.out.println("3rd year Engineer");
		break;
		
		case 4:System.out.println("4th year Engineer");
		break;
		
		default:System.out.println("Invalid year");
		break;
		}



	}

}
