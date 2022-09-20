package DAY18CollectionsIIHapMaapping;

import java.util.*;
public class UseEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("rajesh",15000,25,"Male");
		Employee e2=new Employee("raj",25000,26,"Male");
		Employee e3=new Employee("Sandeep",35000,26,"Male");
		Employee e4=new Employee("priya",35000,25,"Female");
		Employee e5=new Employee("Anbu",30000,25,"Male");
		Employee e6=new Employee("prabhu",15000,25,"Male");
		Employee e7=new Employee("praveen",15000,25,"Male");
		Employee e8=new Employee("pradeep",15000,25,"Male");
		Employee e9=new Employee("pooja",25000,25,"Female");
		Employee e10=new Employee("devan",15000,25,"Male");
		
		HashMap<Integer,Employee> hm=new HashMap<>();
		hm.put(1, e1);
		hm.put(2, e2);
		hm.put(3, e3);
		hm.put(4, e4);
		hm.put(5, e5);
		hm.put(6, e6);
		hm.put(7, e7);
		hm.put(8, e8);
		hm.put(9, e9);
		hm.put(10, e10);
		
		/*for(Integer i:hm.keySet()) {
			System.out.println(i);
		}
		for(Employee m:hm.values()) {
			System.out.println(m);
		}
		
		Iterator b=hm.keySet().iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
			}
		Iterator c=hm.values().iterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
		
		hm.forEach((k,v)->System.out.println(k+","+v)); */
		
		/*for(Employee m:hm.values()) {
			if(m.getGender().equalsIgnoreCase("female")) {
				System.out.println(m);
			}*/
		
		
		/*ArrayList<Employee> femaleEmployee=new ArrayList<>();		
	Iterator ir=hm.values().iterator();
	while(ir.hasNext()) {
		Employee e=(Employee)ir.next();
		if(e.getGender().equalsIgnoreCase("Female")) {
			System.out.println(e);
			femaleEmployee.add(e);	
		}
	}*/
	
	//hm.forEach((d,v)->{if(d>5) {System.out.println(v);}});
	
	HashMap<Integer,Employee> a1=new HashMap<>();
	
	hm.forEach((k,v)->{if(v.getGender().equalsIgnoreCase("Male")) {
	       a1.put(k,v);
	}});
	  
	a1.forEach((e,j)->System.out.println(j));
	
	//femaleEmployee.add();
			
			
			
		}
		
	}


