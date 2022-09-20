package InterviewProgramCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

//HashSet
public class SetDemo {
	public static void main(String[] args) {
		
	
  //HashSet<String> hh=new HashSet<String>();
//LinkedHashSet<String> hh=new LinkedHashSet<String>(); //showa value in assending sorted manner as it has pointer address in node
TreeSet<String>hh=new TreeSet<String>();

   hh.add("Ram");
   hh.add("John");
   hh.add("Jagan");
   hh.add("Johnathan");
   hh.add("Akash");
   hh.add("Ram");
   
  /* TreeSet<Object> intsReverse =
           (TreeSet<Object>)ints.descendingSet(); */
   
   TreeSet<String> hhReverse=(TreeSet<String>)hh.descendingSet();
   //System.out.println(hhReverse);
   
   for (String i:hhReverse) {
	  System.out.println(i);
   }
   }
}
  
  
