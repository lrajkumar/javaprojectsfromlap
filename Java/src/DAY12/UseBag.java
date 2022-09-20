package DAY12;

public class UseBag {
	public static void main(String[] args) {
		Bag bag1=new Bag();
		Bag bag2=new Bag();
		Bag bag3=new Bag();
		//Bag d=new Bag();
		
		bag1.brand="diesel";
		bag1.price=1500;
		bag1.discount=10;
		bag1.taxAmount=10;
		
		bag2.brand="Wildcraft";
		bag2.price=2000;
		bag2.discount=10;
		bag2.taxAmount=10;
		
		bag3.brand="Nike";
		bag3.price=2500;
		bag3.discount=10;
		bag3.taxAmount=10;
		
		Bag[] bags= {bag1,bag2,bag3};
		for(int i=0;i<bags.length;i++) {
			System.out.println("brand="+bags[i].brand+" price="+bags[i].price+" netprice="+bag3.getNetPrice(bags[i].price,bags[i].discount,bags[i].taxAmount));
		}
	}

}
