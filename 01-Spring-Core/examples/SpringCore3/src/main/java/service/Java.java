package service;

public class Java implements ICourse{
	public Java() {
		System.out.println("Java Bean created.");
	}
	@Override
	public Boolean getCourse(double amount) {
		System.out.println("Java course is purchased and fees is paid " + amount);
		return true;
	}
 

}
