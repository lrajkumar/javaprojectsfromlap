package DAY13;

public class UseScooter {
	public static void main(String[] args) {
		Engine1 e1=new Engine1();
		e1.model="BSVI";
		e1.price=1500;
		
		
		Scooter s=new Scooter();
		s.setPrice(12500);
		int sampleNet=s.getPrice()+(s.getPrice()*8/100);
		s.setNetPrice(sampleNet);
		System.out.println(s);
	}

}
