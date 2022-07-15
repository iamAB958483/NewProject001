package inheritance_Study;

public class HierarchicalInheritanceStudy {

	public static void main(String[] args) 
	{
		Mother m =new Mother();  //mother object
		m.Nature();
		
		Son1 s1 =new Son1(); 
		s1.Nature();  //calling super class property using sub class object
		s1.Watch();  //own property
		
		
		Daughter1 d1 =new Daughter1();
		d1.Nature();  //calling super class property using sub class object
		d1.Scooty();  //own property
		
		Daughter1.Look();  //calling own static method
		Daughter1.Love();  //calling static method of super class
		
		Son1.Money();  //calling own property static method
		Son1.Love();  //calling static method of super class
	}

}
