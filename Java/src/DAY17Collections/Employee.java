package DAY17Collections;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private String gender;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
    public void setId(int id) {
    	this.id=id;
    }
    public int getId() {
    	return id;
    }
    public void setSalary(int salary) {
    	this.salary=salary;
    }
    public int getSalary() {
    	return salary;
    }
    public void setGender(String Gender) {
    	this.gender=gender;
    }
    public String getGender() {
    	return gender;
    }
    public String toString() {
    	return "NAME: "+name+", "+"ID: "+id+", "+"SALARY: "+salary+", "+"Gender " +gender;
    }
    public Employee(String name,int id,int salary,String gender) {
    	this.name=name;
    	this.id=id;
    	this.salary=salary;
    	this.gender=gender;
    }
}
