package accessModifiers_study;

public class ProtectedUse {

	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;

	public static void main(String[] args) {
		
		//we can call all members of class
	}
	
	
	{
		System.out.println("Hi i am private method from protectedUse");
	}
	
	void Display2()
	{
		System.out.println("Hi i am Default method from protectedUse");
	}
	
	protected void Display3()
	{
		System.out.println("Hi i am Protected method from protectedUse");
	}
	
	public void Display4()
	{
		System.out.println("Hi i am Public method from protectedUse");
	}

}


