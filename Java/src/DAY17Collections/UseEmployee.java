package DAY17Collections;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("RAJ",101,15000,"Male");
		Employee e2=new Employee("Kumar",102,16000,"Male");
		Employee e3=new Employee("Ashok",103,20000,"male");
		Employee e4=new Employee("kishore",104,21000,"Male");
		Employee e5=new Employee("krishan",105,22000,"Male");
		Employee e6=new Employee("Anil",106,23000,"Male");
		Employee e7=new Employee("pooja",109,25000,"Female");
		Employee e8=new Employee("anbu",107,25000,"Male");
		Employee e9=new Employee("priya",108,26000,"Female");
		Employee e10=new Employee("anjali",110,30000,"Female");
		Employee e11=new Employee("Roshini",111,35000,"Female");
		Employee e12=new Employee("Divya",112,35000,"Female");
		Employee e13=new Employee("Anitha",113,40000,"Female");
		Employee e14=new Employee("Anjana",114,45000,"Female");
		Employee e15=new Employee("Banu",115,50000,"Female");
		
		ArrayList<Employee> e=new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		e.add(e6);
		e.add(e7);
		e.add(e8);
		e.add(e9);
		e.add(e10);
		
		
		ArrayList<Employee>femaleEmployee=new ArrayList<>();
		for(Employee i:e) {
			if(i.getGender().equalsIgnoreCase("Female")) {
				femaleEmployee.add(i);
			}
		}
	  
	 femaleEmployee.forEach((temp)->System.out.println(temp));
			 
		}
}
		
		
		
		
		//for(int i=0;i<e.size();i++) {
			//System.out.println(e.get(i));
		//}
	     
		/*for(Employee i:e) {
	    	 if(i.getName().startsWith("S")) {
	    		 System.out.println(i.getSalary());
	    	  }
	     }*/
		
		
		
		
	


