package Task;

public class Company {
	  private int empId;
      private String empName;
      private int salary;
      private String designation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Company(int empId, String empName, int salary, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Company [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
      
	
}
