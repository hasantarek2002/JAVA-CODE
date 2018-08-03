package Inheritance;

public class Employee {
	public Employee() {
	}
	private String id;
	private String name;
	private int salary;
	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void running(){
		System.out.println("From employee super class.");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}
