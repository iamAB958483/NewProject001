package abstractClass_Study;

public class CC extends Test {

	public static void main(String[] args) {
		
		CC cc= new CC();
		cc.test();
		cc.test1();
	}
	
    @Override
    public void test() {
	
    System.out.println("Test method of Abstract class completed in concrete class");	
	
    }
}
