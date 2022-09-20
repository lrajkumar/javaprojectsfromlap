package hmewrk;

public class UseEmployee extends GovernmentEmployee {
	public static void main(String[] args) {
       GovernmentEmployee ge=new GovernmentEmployee();
       String name1=args[0];
       String name2=args[1];
       String name3=args[2];
       
       ge.walk(name1);
       ge.sleep(name2);
       ge.eat(name3);
	}
	
	
       
}
