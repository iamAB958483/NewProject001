package logicalProgramm;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		
//		String s="@#$%A*&^B@#$%H%^&I@@J##I@#$!!T!!@##";
//		
//		System.out.println(s);
//		
//		String orignalString= s.replaceAll("[^a-zA-Z]","");
//	
//		System.out.println(orignalString);
		
		
		
		String a="1234B#$%@H!@#A&*M!@#A098R**&&^^E@@##";
		
		System.out.println(a);
		
		String Str= a.replaceAll("[^a-zA-B123456789]","");
		
		System.out.println(Str);
		
	}

}
