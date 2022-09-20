package DAY18CollectionsIIHapMaapping;

import java.util.HashMap;
import java.util.Iterator;
public class Sample1 {
	public static void main(String[] args){
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("raja",113);
		hm.put("ravi",114);
		hm.put("randy",115);
		hm.put("dany",16);
		hm.put("anbu",98);
		
		for(String i:hm.keySet()) {
			System.out.println(i);
		}
		for(Integer m:hm.values()) {
			System.out.println(m);
		}
		
		hm.forEach((k,v)->System.out.println(k+","+v));
		
		Iterator b=hm.keySet().iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		Iterator c=hm.values().iterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
			
		}

		}


