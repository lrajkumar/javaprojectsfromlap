package DAY17Collections;

import java.util.ArrayList;

public class Sample2 {
  public static void main(String[] args) {
	  ArrayList<String> li=new ArrayList<>();
	  li.add("doing");
	  li.add("going");
	  li.add("walking");
	  li.add("sleeping");
	  li.add("running");
	  for(int i=0;i<li.size();i++) {
		  System.out.println(li.get(i));
	  }
		  
		  for(String i:li) {
		  System.out.println(i);
	  }
		  li.forEach(Temp->System.out.println(Temp));
  }

  }
