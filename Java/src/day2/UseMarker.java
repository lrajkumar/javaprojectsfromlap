package day2;

public class UseMarker {
  public static void main(String[] args) {
	  Marker marker1=new Marker();
	  Marker marker2=new Marker();
	  marker1.brand="camlin";
	  marker1.colour="Blue";
	  marker1.price=30;
	  marker1.weight=5.34f;
	  
	  
	 // System.out.println("Brand name:"+marker1.brand);
	 // System.out.println("colour name:"+marker1.colour);
	 // System.out.println("price:"+marker1.price);
	 // System.out.println("weight:"+marker1.weight);
	  marker2.brand="reynolds";
	  marker2.colour="Black";
	  marker2.price=20;
	  marker2.weight=6.23f;
	 // System.out.println("Brand name:"+marker2.brand);
	 // System.out.println("Colour name:"+marker2.colour);
	 // System.out.println("price:"+marker2.price);
	 // System.out.println("weight:"+marker2.weight);
	  
	  Marker[] markernew= {marker1,marker2};
	  for(Marker newMark1:markernew) {
		  System.out.println("Brand name:"+newMark1.brand);
		  System.out.println("coour name:"+newMark1.colour);
		  System.out.println("price :"+newMark1.price);
		  System.out.println("weight:"+newMark1.weight);		
	  }
	  
	  }
	  
	  
	  
	  
	  
  }

