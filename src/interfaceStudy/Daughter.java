package interfaceStudy;

public class Daughter implements Father,Mother {

	public static void main(String[] args) {
		
		Daughter d= new Daughter();
		d.Money();
		d.Home();
		d.Nature();
		d.Look();
		d.Love();
		
		
	}

	@Override
	public void Look() {
		System.out.println("Mother Look");
	}

	@Override
	public void Nature() {
		System.out.println("Mother Nature");
		
	}

	@Override
	public void Money() {
		System.out.println("Father Money");
		
	}

	@Override
	public void Home() {
		System.out.println("Father Home");
		
	}
	
	@Override
	public void Love()
	{
		Father.super.Love();  //calling complete method from father interface
		Mother.super.Love();  //calling complete method from another interface
	}



}
