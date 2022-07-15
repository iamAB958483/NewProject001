package logicalProgramm;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c;
		
//		c=a; //c=10
//		a=b; //a=20
//		b=c; //b=10
//		
//		System.out.println("a="+a+" b="+b);
		
		
		a=a+b;  //10+20=30
		b=a-b;  //10-20=10
		a=a-b;  //10-20=10
		
		System.out.println("a="+a+ "b="+b);

		
	}

}
