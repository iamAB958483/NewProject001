package interfaceStudy;

public interface Father {

	void Money();
	void Home();
	default void Love()
	{
		System.out.println("Fathers love");
	}
	
	
	
	
}
