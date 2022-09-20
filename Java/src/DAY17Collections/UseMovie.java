package DAY17Collections;

import java.util.ArrayList;

public class UseMovie {
     public static void main(String[] args) {
    	 Movie m1=new Movie();
    	 m1.movieName="Beast";
    	 m1.noOfScreen=1000;
    	 m1.ticketPrice=500;
    	 m1.isParkingAvailable=true;
    	 
    	 Movie m2=new Movie();
    	 m2.movieName="Kgf";
    	 m2.noOfScreen=1500;
    	 m2.ticketPrice=600;
    	 m2.isParkingAvailable=true;
    	 
    	 Movie m3=new Movie();
    	 m3.movieName="RRR";
    	 m3.noOfScreen=2000;
    	 m3.ticketPrice=700;
    	 m3.isParkingAvailable=false;
    	 
    ArrayList<Movie> m=new ArrayList<>();
     m.add(m1);
     m.add(m2);
     m.add(m3);
     
     for(int i=0;i<m.size();i++) {
    	 System.out.println(m.get(i).movieName+" "+m.get(i).noOfScreen+" "+m.get(i).ticketPrice+" "+m.get(i).isParkingAvailable);
     }
     
     for(Movie i:m) {
    	 System.out.println(i.movieName+" "+i.noOfScreen+" "+i.ticketPrice+" "+i.isParkingAvailable);
     }
     
     m.forEach(temp->System.out.println(temp.movieName+" "+temp.noOfScreen+" "+temp.isParkingAvailable+" "+temp.ticketPrice));
     
     
     
     m.forEach(temp->{if(temp.ticketPrice>500) System.out.println(temp);}});
}
}