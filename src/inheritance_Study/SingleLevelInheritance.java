package inheritance_Study;

public class SingleLevelInheritance {

	public static void main(String[] args) 
	{
		
		Father f= new Father();  //created object of father class
		f.Home();  //calling fathers own properties
		f.Cars();  //calling fathers own properties
		//f.Bike();//you can not call child class property using super class object
		
		Son s=new Son();// created object of son/child class
		s.Bike();// calling sons own properties
		s.Home();// calling fathers/base class property using child class object
		s.Cars();// calling fathers/base class property using child class object
		
	}

	
}
