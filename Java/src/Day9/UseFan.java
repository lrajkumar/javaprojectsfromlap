package Day9;

public class UseFan {
	public static void main(String[] args) {
		Fan f1=new Fan();
		f1.price=1500;
		f1.brand="orient";
		
		Fan f2=new Fan();
		f2.price=1800;
		f2.brand="Crompton";
		
		Fan[] fans= {f1,f2};
		int total=0;
		total =f1.price+f2.price;
		System.out.println("total:"+total);
		for(int i=0;i<fans.length;i++) {
			System.out.println(fans[i].price+" "+fans[i].brand);
		}
	}
}
