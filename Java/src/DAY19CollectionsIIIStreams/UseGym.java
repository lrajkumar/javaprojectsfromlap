package DAY19CollectionsIIIStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseGym {
	public static void main(String[] args) {
		Gym g1=new Gym("Slam",10000,4.4f);
		Gym g2=new Gym("Tiger",14000,4.2f);
		Gym g3=new Gym("FitnessFreak",15000,4.3f);
		Gym g4=new Gym("Monk",14000,4.5f);
		Gym g5=new Gym("Tatva",16000,4.6f);
		
		ArrayList<Gym> gyms=new ArrayList<>();
		gyms.add(g1);
		gyms.add(g2);
		gyms.add(g3);
		gyms.add(g4);
		gyms.add(g5);
		
		//for(Gym i:gyms) {
			//System.out.println(i.getGymFee().charAt(i.getGymName().length()-1));
		//}
		
		
		
		//Map 
	List<String>l=gyms.stream().map(z->z.getGymName().toUpperCase()).collect(Collectors.toList());
		l.forEach(x->System.out.println(x))	;			
		
  List<Integer>k=gyms.stream().map(c->c.getGymName().length()).collect(Collectors.toList());
        k.forEach(v->System.out.println(v));
		
	List<Boolean>j=gyms.stream().map(m->m.getGymName().contains("a")).collect(Collectors.toList());
	j.forEach(c->System.out.println(c));
	
	List<Boolean>p=gyms.stream().map(o->o.getGymName().startsWith("s")).collect(Collectors.toList());
	p.forEach(i->System.out.println(i));
	
	List<Boolean>u=gyms.stream().map(y->y.getGymName().endsWith("n")).collect(Collectors.toList());
	u.forEach(t->System.out.println(t));
	
	List<String>e=gyms.stream().map(w->w.getGymName().substring(0,2)).collect(Collectors.toList());
	e.forEach(w->System.out.println(w));
	
	List<Character>q=gyms.stream().map(a->a.getGymName().charAt(a.getGymName().length()-1)).collect(Collectors.toList());
	//q.forEach(z->System.out.println(z));
	
	List<Boolean>h=gyms.stream().map(n->n.getGymName().equals("a")).collect(Collectors.toList());
	h.forEach(t->System.out.println(t));
	
	//gyms.values                                                        
	
	List<Gym> l1=gyms.stream().filter(x->x.getGymName().startsWith("S")).collect(Collectors.toList());
	l1.forEach(g->System.out.println(g.getGymName()));
	
List<String> a1=gyms.stream().filter(b->b.getGymName().endsWith("a")).map(m->m.getGymName().toUpperCase()).collect(Collectors.toList());
         a1.forEach(t->System.out.println(t));
         
         
       
  long b1=gyms.stream().count();
  System.out.println(b1);
         
  long b2=gyms.stream().filter(z->z.getGymName().startsWith("S")).count();
  System.out.println(b2);
  
  //b2.forEach(q->System.out.println(q));
  
  long b3=gyms.stream().filter(x->x.getGymName().startsWith("T")).count();
 System.out.println(b3);
  

 
	}

}
