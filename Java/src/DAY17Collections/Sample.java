package DAY17Collections;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(450);
		li.add(250);
		li.add(75);
		li.add(60);
		li.add(75);
		
		for(int i=0;i<li.size();i++){
			System.out.println(li.get(i));
		}
			for(Integer i:li) {
				System.out.println(i);
		}
			
		li.forEach(temp->{if(temp>350)System.out.println(temp);});	
		
			
	}

}

