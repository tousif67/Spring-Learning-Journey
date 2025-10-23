package service;

public class User {
	private ICourse course;
	public User(ICourse course) {
		this.course = course;
	}

	public void setCourse(ICourse course) {
		this.course = course;
	}
	
	public Boolean buyTheCourse(double amount) {
		return course.getCourse(amount);
	}
	

}
