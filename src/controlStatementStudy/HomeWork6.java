package controlStatementStudy;

public class HomeWork6 {

	public static void main(String[] args) {
		
		char Grade='A';
		switch (Grade)
		{
		case 'A':System.out.println("Your Percentage is 76 to 100");
		break;
		
		case 'B':System.out.println("Your Percentage is 61 to 75");
		break;
		
		case 'C':System.out.println("Your Percentage is 41 to 60");
		break;
		
		case 'D':System.out.println("Your Percentage is Less then 40 Your Are Fail");
		break;
		
		default :System.out.println("Invalid Gread");
		break;
		}
		
	}

}
