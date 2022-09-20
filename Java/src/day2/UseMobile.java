package day2;

public class UseMobile {
         public static void main (String[] args) {
        	 Mobile details1=new Mobile();
        	 details1.brand="Apple";
        	 details1.colour="Black";
        	 details1.price=18000;
        	 details1.discount=(20*details1.price)/100;
        	 details1.tax=(30*details1.price)/100;
        	 details1.netPrice=(details1.price+details1.tax)-(details1.discount);
        	 System.out.println("Brand Name:"+details1.brand);
        	 System.out.println("Colour:"+details1.colour);
        	 System.out.println("netPrice:"+details1.netPrice);
        	 Mobile details2=new Mobile();
        	 details2.brand="Samsung";
        	 details2.price=30000;
        	 details2.colour="Blue";
        	 details2.discount=(20*details2.price)/100;
        	 details2.tax=(30*details2.price)/100;
        	 details2.netPrice=(details2.price+details2.tax)-(details2.discount);
        	 System.out.println("Brand:"+details2.brand);
        	 System.out.println("colour:"+details2.colour);
        	 System.out.println("Net Price:"+details2.netPrice);
        	 System.out.println("total price:"+(details1.netPrice+details2.netPrice));
        	 System.out.println("discount"+details2.discount);
        	 System.out.println("discount"+details1.discount);
        	 boolean check=(details1.netPrice<=20000);
        	 System.out.println(check);
        	 boolean check1=(details2.netPrice>=20000);
        	 System.out.println(check1);
        	 boolean check2=(details1.netPrice>details2.netPrice);
        	 System.out.println(check2);
        	 boolean check3=(details2.netPrice<details1.netPrice);
        	 System.out.println(check3);
        	 boolean check4=(details2.totalPrice>=70000);
        	 System.out.println(check4);
        	 boolean check5=(details1.totalPrice)+(details2.totalPrice)>=70000;
        	 System.out.println(check5);
        	 boolean check6=(details1.totalPrice)+(details2.totalPrice)<=50000;
        	 System.out.println(check6);
        	 boolean check7=(details1.totalPrice==70000);
        	System.out.println(check7);
        	boolean check8=(details2.totalPrice!=40000);
        	System.out.println(check8); 
        	
         }
}
