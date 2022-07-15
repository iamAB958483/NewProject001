package interfaceStudy;

public interface Mother {
	
	void Look();
	void Nature();
	default void Love()
	{
		System.out.println("Mothers Love");
	}
	
}
