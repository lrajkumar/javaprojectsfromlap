package DAY17Collections;
import java.util.*;
public class UseCctv {
	public static void main(String[] args) {
		Cctv c1=new Cctv("Sony",10000,"blue",true);
		Cctv c2=new Cctv("Samsung",15000,"Black",false);
		Cctv c3=new Cctv("Nixon",18000,"Brown",true);
		Cctv c4=new Cctv("Lg",18500,"Green",false);
		Cctv c5=new Cctv("Onida",16000,"Cyan",true);
		
		HashMap <Integer,Cctv> hm=new HashMap<>();
		hm.put(10,c1);
		hm.put(15,c2);
		hm.put(16,c3);
		hm.put(17,c4);
		hm.put(12,c5);
		
		int max=0;
		for(Cctv i:hm.values()) {
			if(i.getIsWaterResistance()==true) {
				if(i.getPrice()>max) {
					max=i.getPrice();
				}
			}
			
		}
		System.out.println(max);
    for(Cctv e:hm.values()) {
    	if(max==e.getPrice()) {
    		System.out.println(e);
    	}
    }
   
    Iterator an=hm.values().iterator();
    while(an.hasNext()) {
    	Cctv e=(Cctv)an.next();
    	if(e.getIsWaterResistance()==true) {
    		if(e.getPrice()>max) {
    			max=e.getPrice();
    		}
    		
    	}
    	
    }
    System.out.println(max);
}
}
