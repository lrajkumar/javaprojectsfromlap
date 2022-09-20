package DAY13;

public class UsePhone {
	public static void main(String[] args) {
		Charger c=new Charger();
		c.brand="Zebronics";
		c.price=20000;
		c.color="Black";
		
		Phone p1=new Phone();
		p1.name="Redmi";
		p1.price=18000;
		p1.color="Black";
		p1.charger=c;
		
System.out.println("Brand:"+p1.name+", "+"Price:"+p1.price+", "+"Color:"+p1.color+", "+"Charger:"+p1.charger.brand+", "+"Charger price:"+p1.charger.price+", "+"charger colot:"+p1.charger.color);
		
	}

}
