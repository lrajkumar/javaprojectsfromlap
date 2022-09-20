package InterviewProgramCollection;


import java.util.*;
public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(500);
		li.add(450);
		li.add(350);
		li.add(940);
		
		for(int i=0;i<li.size();i++);
		
		
		li.add(150);
		li.add(450);
		System.out.println(li);
		//System.out.println(li.get(3));
		System.out.println(li.set(4, 143));
		System.out.println(li.remove(3));
			
		
		 /*for(int i:li)
			System.out.println(i);
		Iterator <Integer> i=li.iterator();
		while(i.hasNext());
		System.out.println(i.next());
		System.out.println(li.remove(1));
		ArrayList l=new ArrayList();
			l.add("john");
			l.add("l");
			l.add(15);
			System.out.println(l); */
			
		//linkedlist
			
			LinkedList<String> ki=new LinkedList<>();
			ki.add("john");
			ki.add("joseph");
			ki.add("jagan");
			ki.add("jagadesh");
			ki.add("jagan");
			
			/*System.out.println(ki.getFirst());
			System.out.println(ki.size());
			//System.out.println(ki.remove(3));
			System.out.println(ki.get(2));
			
			
			System.out.println(ki.contains("jagan"));*/
			
			
			for(String j:ki) 
			System.out.println(j); 
				
			}
			
			
			
	}

	


