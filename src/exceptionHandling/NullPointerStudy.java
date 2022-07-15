package exceptionHandling;

public class NullPointerStudy {

	public static void main(String[] args) throws InterruptedException {
		
		String a="xyz";
		String b=null;
		
		Thread.sleep(100);
		
		try
		{
			System.out.println(10/0);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Check String, String should not be null");
		}
		
		

	}

}
