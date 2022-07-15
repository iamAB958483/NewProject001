package genelization;

public class TestGeneralization {

	public static void main(String[] args) {
		
		Airtel a= new Airtel();
		System.out.println("=======Airtel=======");
		a.call();
		a.msg();
		a.data();
		a.NewMethod_Airtel();
		System.out.println("=======Aitel=======");
		
		
		Jio j= new Jio();
		System.out.println("=======Jio=======");
		j.call();
		j.msg();
		j.data();
		j.NewMethod_Jio();
		System.out.println("=======Jio=======");
		
		
		VI vi= new VI();
		System.out.println("=======VI=======");
		vi.call();
		vi.msg();
		vi.data();
		vi.NewMethod_VI();
		System.out.println("=======VI=======");
	}

}
