package hmewrk;

	import java.util.ArrayList;
     public class UseCycle {
     public static void main(String[] args) { 
    	 String[] a=args[0].split(",");
    	 String brand=a[0];
           int price=Integer.parseInt(a[1]); 
          boolean isElectric=Boolean.parseBoolean(a[2]);
          
         Cycle cyclel=new Cycle(brand,price,isElectric);

	String[] b=args[1].split(","); 
	String cbrand=b[0];
     int cprice=Integer.parseInt(b[1]); 
     boolean cisElectric=Boolean.parseBoolean(b[2]);
     Cycle cycle2=new Cycle(cbrand, cprice, cisElectric);

	String[] c=args[2].split(",");
    String dbrand=c[0];
	int dprice=Integer.parseInt(c[1]);
	boolean disElectric=Boolean.parseBoolean(c[2]);
	
	Cycle cycle3=new Cycle(dbrand,dprice,disElectric);

	ArrayList<Cycle> cycles=new ArrayList<>();

	cycles.add(cyclel);
    cycles.add(cycle2);
    cycles.add(cycle3);

	for(int i=0;i<cycles.size();i++) {
		if (cycles.get(i).getPrice()%2==0) {

	System.out.println(cycles.get(i).getBrand());
	}
     }

}
  }
