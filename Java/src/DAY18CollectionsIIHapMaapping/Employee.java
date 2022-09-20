package DAY18CollectionsIIHapMaapping;

public class Employee {
        private String  name;
          private int salary;
          private int age;
          private String gender;
          
          public void setName(String name) {
        	  this.name=name;
          }
          public String getName() {
        	  return name;
          }
           public void setSalary(int salary) {
        	   this.salary=salary;
           }
        	public int getSalary()  {
        		return salary;
        	}
        	public void setAge(int age) {
        		this.age=age;
        		
        	}
        	public int getAge() {
        		return age;
        		
        	}
        	public void setGender(String gender) {
        		this.gender=gender;
        	}
        	public String getGender() {
        		return gender;
        	}
        	
           public String toString() {
        	   return name+","+salary+","+age+","+gender;
           }
           
           public Employee(String name,int salary,int age,String gender){
        	   this.name=name;
        	   this.salary=salary;
        	   this.age=age;
        	   this.gender=gender;
           }
}
