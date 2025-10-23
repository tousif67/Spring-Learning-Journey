package service;

public class SpringBoot implements ICourse
{

	@Override
	public Boolean getCourse(double amount) {
		System.out.println("SpringBoot course is purchased and fees is paid " + amount);
		return true;
	}
 
}
