package Day11;

public class UseCar {
      public static void main(String[] args) {
    	  Car car1=new Car();
    	  Car car2=new Car();
    	  Car car3=new Car();
    	  
    	  
    	  car1.brand="HYUNDAI";
    	  car1.price=800000;
    	  car1.color="BLACK";
    	  
    	  car2.brand="KIA";
    	  car2.price=900000;
    	  car2.color="BLUE";
    	  
    	  car3.brand="MARUTHI SUZUKI";
    	  car3.price=700000;
    	  car3.color="GREY";
    	  
    	  Car[] cars= {car1,car2,car3};
    	  for(int i=0;i<cars.length;i++) {
    		  if(cars[i].price>800000) {
    			  System.out.println(cars[i].brand+","+cars[i].color+","+cars[i].price);
    		  }
    	  }
    	  
    	  
    	  for(int i=0;i<cars.length;i++) {
    		  if(cars[i].brand.contains("Y")) {
    			  System.out.println(cars[i].brand+","+cars[i].color);
    		  }
    	  }
    	  
    	  
    		  for(int i=0;i<cars.length;i++) {
    			  if(cars[i].brand.startsWith("M")) {
    				  System.out.println(cars[i].brand+","+cars[i].color);
    			  }
    		  }
    		  
    		  
    		  for(int i=0;i<cars.length;i++) {
    			  if(cars[i].price<800000) {
    				  System.out.println(cars[i].brand+","+cars[i].color+","+cars[i].price);  
    			  }
    		  }
    		  
    		  
    		  for(int i=0;i<cars.length;i++) {
    			  if(cars[i].price==800000) {
    				  System.out.println(cars[i].brand+","+cars[i].color+","+cars[i].price);
    			  }
    		  }
    		  
    		  for(int i=0;i<cars.length;i++) {
    			  if(cars[i].color=="BLUE") {
    				  System.out.println(cars[i].brand+","+cars[i].price);  
    			  }
    		  }
    		   
    		  for(int i=0;i<cars.length;i++) {
    			  if(cars[i].brand=="KIA") {
    				  System.out.println(cars[i].brand+","+cars[i].color+","+cars[i].price);
    			  }
    			  
    		  }
    		  
    		  for(int i=0;i<cars.length;i++) {
    			  if(cars[i].color.startsWith("B")) {
    				  System.out.println(cars[i].brand+","+cars[i].price);
    			  }
    		  }
    		  
    		  for(int i=0;i<cars.length;i++) {
    			  if(cars[i].brand.endsWith("I")) {
    				  System.out.println(cars[i].brand+","+cars[i].color+","+cars[i].price); 
    			  }
    		  }
    		  for(int i=0;i<cars.length;i++) {
    			  if(cars[i].brand.equals("KIA")) {
    				  System.out.println(cars[i].color+","+cars[i].price);
    			  }
    		  }
    		  
    		  for (int i=0;i<cars.length;i++) {
    			  if(cars[i].brand.equalsIgnoreCase("m")) {
    				 System.out.println("PRINT:" +cars[i].brand+","+cars[i].color+","+cars[i].price);
    			 }
    		  }
    		  
    		  
           
    	  
      }
    	  
    	  
      }

