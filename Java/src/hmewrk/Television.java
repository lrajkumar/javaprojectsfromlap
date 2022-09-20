package hmewrk;

public class Television extends SmartTelevision {
     String brand;
     int price;
     
     public String getNetPrice(int price,int deliveryCharge) {
    	int netPrice=price+deliveryCharge;
    	 if(netPrice > 50000) {
    		 return "Heavy";
    	 }
    	 else {
    		 return "below 50000";
    	 }
     }
     
     public String wifiAccess(String access) {
    	 return access;
     }
}
