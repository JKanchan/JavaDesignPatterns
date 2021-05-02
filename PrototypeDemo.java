package designPattern;

interface Prototype {
	public Prototype getClone();
}

class Employee implements Prototype{
	int id;
	String name;
	String department;
	String designation;

	public Employee() {}

	public Employee(int id, String name, String department, String designation) {
		this();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}

	public Employee(String department, String designation) {
		this.department = department;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ "]";
	}
	@Override
	public Prototype getClone() {
		return new Employee(department, designation);	
	}
	
}
class PrototypeDemo{
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Kanchan","CSE","Software Engineer");
		Employee e2 = (Employee)e1.getClone();
		System.out.println(e1);
		e2.setId(2);
		e2.setName("Naresh");
		System.out.println(e2);
		
	}
}