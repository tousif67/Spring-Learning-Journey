package service;

public class Employee {
	private Integer id;
	private String name;
	private double salary;
	private String city;
	private Department dp;
	
	
//	public Employee(Integer id, String name, double salary, String city, Department dp) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.city = city;
//		this.dp = dp;
//	}
	
	
	public Employee() {
		super();
		System.out.println("Employee bean Created");
	}
	


	public void setId(Integer id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setDp(Department dp) {
		this.dp = dp;
	}


	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + ", dp=" + dp + "]";
	}

	public String employeeTask() {
		return "Every Employee acts productive but in reality they are less productive.";
	}
}