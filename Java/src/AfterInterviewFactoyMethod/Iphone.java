package AfterInterviewFactoyMethod;

public class Iphone implements Mobile {
   private int ramSize;
   private String processor;
   private String GPU;
    public Iphone(int ramType,String processor,String GPU) {
    	this.ramSize=ramSize;
    	this.processor=processor;
    	this.GPU=GPU;
    	
    }
}
