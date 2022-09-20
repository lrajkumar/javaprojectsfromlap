package ObserverDesignPatternInter;

public class Youtube  {
   public static void main(String[] args) {
	
	   Channel telusko=new Channel();
	   Subscriber S1=new Subscriber("Akshay");
	   Subscriber S2=new Subscriber("Akshaya");
	   Subscriber S3=new Subscriber("jeeva");
	   Subscriber S4=new Subscriber("jagadish");
	   Subscriber S5=new Subscriber("Akshay");
	   
	   telusko.subcribe(S1);
	   telusko.subcribe(S2);
	   telusko.subcribe(S3);
	   telusko.subcribe(S4);
	   telusko.subcribe(S5);
	   
	   
	   telusko.unSubscribe(S4);
	   
	  S1.subcribeChannel(telusko);
	  S2.subcribeChannel(telusko);
	  S3.subcribeChannel(telusko);
	  S4.subcribeChannel(telusko);
	  S5.subcribeChannel(telusko);
	  
	  
	  
	  
	  telusko.upload("How to learn Programming");
	  
	  
	  
}


   
   
   
}
