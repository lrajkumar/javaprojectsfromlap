package Day11;

public class UseAirCondtioner {
	public static void main(String[] args) {
		AirConditioner ac1=new AirConditioner();
		AirConditioner ac2=new AirConditioner();
		AirConditioner ac3=new AirConditioner();
		
		
		ac1.brand="Samsung";
		ac1.price=20000;
		ac1.color="white";
		ac1.upperCase=ac1.brand.toUpperCase();
		ac1.lengthString=ac1.brand.length();
		
		
		ac2.brand="voltas";
		ac2.price=30000;
		ac2.color="Black";
		ac2.upperCase=ac2.brand.toUpperCase();
		ac2.lengthString=ac2.brand.length();
		
		ac3.brand="Bluestar";
		ac3.price=40000;
		ac3.color="grey";
		ac3.upperCase=ac3.brand.toUpperCase();
		ac3.lengthString=ac3.brand.length();
		
		
		int max=0;
		AirConditioner[] acs=new AirConditioner[3];
		acs[0]=ac1;
		acs[1]=ac2;
		acs[2]=ac3;
				
		
		int min=acs[0].lengthString;
		/*for(int i=0;i<acs.length;i++) {
			if(acs[i].brand.length()>6) {
				System.out.println("Brand name: "+acs[i].brand);
			}
			}
		for(int i=0;i<acs.length;i++) {
			if(acs[i].price>30000) {
				System.out.println(acs[i].brand.toUpperCase());
			}
		}*/
			 
		for(int i=0;i<acs.length;i++) {
			if(acs[i].brand.equals(acs[i].upperCase)) {
				System.out.println(acs[i].brand);
			}
		}
		
		//maximum string
		/*
		for(int i=0;i<acs.length;i++) {
			if(acs[i].lengthString>max) {
				max=acs[i].lengthString;
			}
		}
		for(int i=0;i<acs.length;i++) {
			if(max==acs[i].lengthString) {
				System.out.println("Brand name: "+acs[i].brand);
			}
		}
		System.out.println("Length of highest brand:"+max);
		      
		
		
		//minimum string
		for(int i=0;i<acs.length;i++) {
			if(acs[i].lengthString<min) {
				min=acs[0].lengthString;
			}
		}
			
		
			for(int i=0;i<acs.length;i++) {
				if(min==acs[i].lengthString) {
					System.out.println("Brand name min length: "+acs[i].brand);
				}
			}
			
			System.out.println("Length of highest brand:"+min);*/
		}
	}	
		
		
	


