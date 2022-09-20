package AfterInterview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
	     hm.put("Suriyan",101);
	     hm.put("Nithya",102);
	     hm.put("Ragavi",103);
	     Set s=hm.keySet();
	     System.out.println(s);  //onlykeyset can be output
	     Collection y=hm.values();   // HashMap does not maintaoin order;
	     
	}     
	     
}
