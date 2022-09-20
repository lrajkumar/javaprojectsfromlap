package Day11;

public class UsePencil {
	public static void main(String[] args) {
		Pencil pencil1=new Pencil();
		Pencil pencil2=new Pencil();
		Pencil pencil3=new Pencil();
		
		pencil1.brand="APSARA";
		pencil1.color="BLACK";
		pencil1.price=10;
		
		pencil2.brand="NATRAJ";
		pencil2.color="BLUE";
		pencil2.price=15;
		
		pencil3.brand="CAMLIN";
		pencil3.color="BROWN";
		pencil3.price=20;
		
		Pencil[] pencils= {pencil1,pencil2,pencil3};
		for(int i=0;i<pencils.length;i++) {
			if(pencils[i].brand.length()>5) {
				System.out.println("BARND NAME:"+pencils[i].brand+","+"PRICE:"+pencils[i].price);
			}
		}
		for(int i=0;i<pencils.length;i++) {
if(pencils[i].brand.contains("A")||pencils[i].brand.contains("E")||pencils[i].brand.contains("I")||pencils[i].brand.contains("O")||pencils[i].brand.contains("U")) {
	System.out.println("BRAND:"+pencils[i].brand+","+"PRICE:"+pencils[i].price+","+"COLOR:"+pencils[i].color)	;		
			}
		}
		
		for(int i=0;i<pencils.length;i++) {
if(pencils[i].brand.equalsIgnoreCase("C")) {
	System.out.println("BRAND NAME:"+pencils[i].brand+","+"COST PRICE:"+pencils[i].price);	
	
}
		}
	}

}
