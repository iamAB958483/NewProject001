package interfaceStudy;

public class Sample implements Son {

	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.Money();
		s.Home();
		s.Bike();
		
	}

	@Override
	public void Money() {
		
		System.out.println("Money--->Father Property");
		
	}

	@Override
	public void Home() {
		System.out.println("Home--->Father Property");
		
	}

	@Override
	public void Bike() {
		System.out.println("Bike--->Son Property");
		
	}

	@Override
	public void Mobile() {
		System.out.println("Mobile---> Son property");
		
	}
	
	

}
