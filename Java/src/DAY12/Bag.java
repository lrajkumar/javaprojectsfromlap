package DAY12;

public class Bag {
       String brand;
       int discount;
       int price;
       int netPrice;
       int taxAmount;


       public int getNetPrice(int price,int discount ,int taxAmount ) {
    	   int net=(price-(price*discount/100)+(taxAmount*price/100));
    	   return net;
       }
    	   
}
