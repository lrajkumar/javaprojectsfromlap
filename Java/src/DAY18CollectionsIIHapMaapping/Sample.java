package DAY18CollectionsIIHapMaapping;

import java.util.HashMap;
import java.util.Iterator;

public class Sample {
 public static void main(String[] args) {
	 HashMap<Integer,String> hm=new HashMap<>();
	 hm.put(101,"Dany");
	 hm.put(102, "Raja");
	 hm.put(103, "Rajesh");
	 hm.put(104, "jonny");
	 
	 for(Integer e:hm.keySet()) {
		 System.out.println(e);
	 }
	 for(String m:hm.values()) {
		 System.out.println(m);
	 }
 
     hm.forEach((j,v)->System.out.println(j+","+v));

       Iterator irr=hm.keySet().iterator();
       while(irr.hasNext()) {
    	   System.out.println(irr.next());
    	   }
       
       Iterator v=hm.values().iterator();
       while(v.hasNext()) {
    	   System.out.println(v.next());
       }
       
       
 }

}
