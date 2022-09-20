package Task;

import java.util.ArrayList;

public class UseCompany {
	public static void main (String[] args) {
		
		Company c1=new Company(100,"Rajesh",35000,"Developer");
		Company c2=new Company(101,"Rajeshwari",38000,"Tester");
		Company c3=new Company(102,"Rajeshekar",28000,"Support");
		Company c4=new Company(103,"Rajeshgowda",25000,"System Enginner");
		Company c5=new Company(104,"Ramesh",32000,"Developer");
	
	ArrayList<Company> li=new ArrayList<>();
	         li.add(c1);
	         li.add(c2);
	         li.add(c3);
	         li.add(c4);
	         li.add(c5);
	         
			  int count=0;
			  int count1=0;
			  int count2=0;
			  int count3=0;
			  
	  for(Company i:li) {

		  if (i.getDesignation().equalsIgnoreCase("Developer")) {
			  count++;
			  System.out.println(i);
			  
		  }
		  else if(i.getDesignation().equalsIgnoreCase("Tester")) {
			  count1++;
			 System.out.println(i);
		  }
		  
		  else if(i.getDesignation().equalsIgnoreCase("Support")) {
			  count2++;
			  System.out.println(i);
		  }
		  else if(i.getDesignation().equalsIgnoreCase("System Engineer")) {
			  count3++;
			  System.out.println(i);
		  }
		  
	  }
	  System.out.println("Developer count is" +count);
	  System.out.println("Tester count is" +count1);
	  System.out.println("Suppport count is" +count2);
	  System.out.println("System Engineer count is" +count3);
	
	}

}
