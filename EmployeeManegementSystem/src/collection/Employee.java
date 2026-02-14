package collection;

public class Employee {
	private int id;
    private String name;
    private String department;
    private String designation;
    private Double salary;
    private int yearOfExperience;

	public Employee(int id, String name, String department, String designation, Double salary, int yearOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.yearOfExperience = yearOfExperience;
	}
	public  int getId() {
		return id;
	}
	public  void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  String getDepartment() {
		return department;
	}
	public  void setDepartment(String department) {
		this.department = department;
	}
	public  String getDesignation() {
		return designation;
	}
	public  void setDesignation(String designation) {
		this.designation = designation;
	}
	public  Double getSalary() {
		return salary;
	}
	public  void setSalary(Double salary) {
		this.salary = salary;
	}
	public  int getYearOfExperience() {
		return yearOfExperience;
	}
	public  void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	@Override
	public String toString() {
		return "Emlpoyee [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ ", salary=" + salary + ", yearOfExperience=" + yearOfExperience + "]";
	}
    
    
	

}
