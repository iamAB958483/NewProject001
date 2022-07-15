package casting;

public class Upcasting {

	public static void main(String[] args) {
		
		Father f=new Father();
		f.Bike();
		f.Car();
		
		Son s=new Son();
		s.Bike();
		s.car();
		s.Degree();
		
		Father f1= new Son();
		f1.Bike();
		f1.Car();
		//f1.Degree();

	}

}
