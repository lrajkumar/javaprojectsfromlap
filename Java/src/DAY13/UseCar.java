package DAY13;

public class UseCar {
	public static void main(String[] args) {
		Engine e=new Engine();
		e.brand="XMV";
		e.price=20000;
		
		Car c=new Car();
		c.brand="Innova";
		c.price=1700000;
		c.color="Black";
		c.engine=e;
		
		
	System.out.println("Brand:"+c.brand+", "+"Price:"+c.price+", "+"Color:"+c.color+", "+"Engine brand:"+c.engine.brand+", "+"Engine price:"+c.engine.price);
	}

	}


