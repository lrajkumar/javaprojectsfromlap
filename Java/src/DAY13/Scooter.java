package DAY13;

public class Scooter {
    private int price;
   String brand;
        String model;
      private  int netPrice;
      
        Engine1 engine1;
        
        
        
        public void setPrice(int price) {
        	this.price=price;
        }
        public int getPrice() {
        	return price;
        }
        
        public void setNetPrice(int netPrice) {
        	this.netPrice=netPrice;
        }
        public int getNetPrice() {
        	return netPrice;
        }
        
        public String toString() {
        	return price+", "+netPrice;
        }
        	
        
}


