package inheritance_Study;

public class MultiLevelInheritanceStudy {

	public static void main(String[] args) 
	{
		Father f= new Father();// created object of super most class
		f.Home();// calling own properties
		f.Cars();// calling own properties
		
		Son s= new Son();// created object of child class
		s.Bike();// calling own property
		s.Home();// calling super class property using subclass object
		s.Cars();// calling super class property using subclass object
		
		Grandson gr= new Grandson();// created object of subclass
		gr.Cycle();// calling own property 
		gr.Bike();// calling super class property using subclass object
		gr.Home();// calling super most class property using subclass object 
		gr.Cars();// calling super most class property using subclass object

		
	}

}
